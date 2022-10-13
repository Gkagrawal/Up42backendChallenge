package com.up42.coding.challenge.services;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.up42.coding.challenge.constants.FeaturesConstants;
import com.up42.coding.challenge.model.Feature;
import com.up42.coding.challenge.model.FeatureCollection;
import com.up42.coding.challenge.model.responseModel.FeatureResponse;
import com.up42.coding.challenge.model.responseModel.PersistedFeature;
import com.up42.coding.challenge.repositories.FeaturesRepository;
import com.up42.coding.challenge.utils.FeaturesUtil;

@Service
public class FeaturesService {

    Logger logger = LoggerFactory.getLogger(FeaturesService.class);

    @Autowired
    private FeaturesRepository featuresRepository;

    public List<FeatureResponse> getFeatures() throws IOException {
        logger.info("Inside {} method of {}","getFeatures",this.getClass());
        ObjectMapper objectMapper = new ObjectMapper();
        List<FeatureCollection> featureCollectionList = objectMapper.readValue(new File(FeaturesConstants.SOURCE_DATA_FILE_PATH), new TypeReference<List<FeatureCollection>>(){});
        List<PersistedFeature> persistedFeatureList = new ArrayList<>();
        List<FeatureResponse> featureResponseList = new ArrayList<>();
        populateFeatureData(featureCollectionList, persistedFeatureList, featureResponseList);
        featuresRepository.saveToJson(persistedFeatureList);
        return featureResponseList;
    }
    public byte[] getImage(String featureId) throws IOException {
        logger.info("Inside {} method of {}","getImage",this.getClass());
        String imageBase64 = "";
        List<PersistedFeature> persistedFeatureList = featuresRepository.getPersistedFeatureList();
        if(Objects.isNull(persistedFeatureList)) {
            getFeatures();
            persistedFeatureList = featuresRepository.getPersistedFeatureList();
        }

        for (PersistedFeature persistedFeature: persistedFeatureList) {
            if(persistedFeature.getId().equalsIgnoreCase(featureId)) {
                imageBase64 = persistedFeature.getQuickLook();
                break;
            }
        }

        if(!imageBase64.equalsIgnoreCase("")) {
            byte [] image = FeaturesUtil.convertBase64ToByteArray(imageBase64);
            return image;
        }

        return null;
    }

    private void populateFeatureData(List<FeatureCollection> featureCollectionList, List<PersistedFeature> persistedFeatureList, List<FeatureResponse> featureResponseList) {
        for(FeatureCollection featureCollection: featureCollectionList) {
            for (Feature feature: featureCollection.getFeatures()) {
                FeatureResponse featureResponse = getFeatureResponse(feature);
                PersistedFeature persistedFeature = getPersistedFeature(feature);
                featureResponseList.add(featureResponse);
                persistedFeatureList.add(persistedFeature);
            }
        }
    }

    private FeatureResponse getFeatureResponse(Feature feature) {
        FeatureResponse featureResponse = new FeatureResponse();
        featureResponse.setId(feature.getProperties().getId());
        featureResponse.setTimestamp(feature.getProperties().getTimestamp());
        featureResponse.setBeginViewingDate(feature.getProperties().getAcquisition().getBeginViewingDate());
        featureResponse.setEndViewingDate(feature.getProperties().getAcquisition().getEndViewingDate());
        featureResponse.setMissionName(feature.getProperties().getAcquisition().getMissionName());
        return featureResponse;
    }

    private PersistedFeature getPersistedFeature(Feature feature) {
        PersistedFeature persistedFeature = new PersistedFeature();
        persistedFeature.setId(feature.getProperties().getId());
        persistedFeature.setTimestamp(feature.getProperties().getTimestamp());
        persistedFeature.setBeginViewingDate(feature.getProperties().getAcquisition().getBeginViewingDate());
        persistedFeature.setEndViewingDate(feature.getProperties().getAcquisition().getEndViewingDate());
        persistedFeature.setMissionName(feature.getProperties().getAcquisition().getMissionName());
        persistedFeature.setQuickLook(feature.getProperties().getQuicklook());
        return persistedFeature;
    }
}
