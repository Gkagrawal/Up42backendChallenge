package com.up42.coding.challenge.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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
		logger.info("Inside {} method of {}", "getFeatures", this.getClass());
		ObjectMapper objectMapper = new ObjectMapper();
		List<FeatureCollection> featureCollectionList = objectMapper.readValue(
				new File(FeaturesConstants.SOURCE_DATA_FILE_PATH), new TypeReference<List<FeatureCollection>>() {
				});
		HashMap<String,PersistedFeature> persistedFeatureMap = new HashMap<>();
		List<FeatureResponse> featureResponseList = new ArrayList<>();
		populateFeatureData(featureCollectionList, persistedFeatureMap, featureResponseList);
		
		//assuming source data is going to be same so we will write it to JSon file for first time.
		if(Objects.isNull(featuresRepository.getPersistedFeatureMap()))
		{
			featuresRepository.persistData(persistedFeatureMap);
		}
		
		return featureResponseList;
	}

	public byte[] getImage(String featureId) throws IOException {
		logger.info("Inside {} method of {}", "getImage", this.getClass());
		String imageBase64 = "";
		HashMap<String, PersistedFeature> persistedFeatureMap = featuresRepository.getPersistedFeatureMap();
		if (Objects.isNull(persistedFeatureMap)) {
			getFeatures();
			persistedFeatureMap = featuresRepository.getPersistedFeatureMap();
		}

		if(persistedFeatureMap.containsKey(featureId))
		{
			imageBase64 = persistedFeatureMap.get(featureId).getQuickLook();
			
		}

		if (imageBase64!=null && !imageBase64.equalsIgnoreCase("")) {
			byte[] image = FeaturesUtil.convertBase64ToByteArray(imageBase64);
			return image;
		}

		return null;
	}

	private void populateFeatureData(List<FeatureCollection> featureCollectionList,
			HashMap<String, PersistedFeature> persistedFeatureList, List<FeatureResponse> featureResponseList) {
		for (FeatureCollection featureCollection : featureCollectionList) {
			for (Feature feature : featureCollection.getFeatures()) {
				FeatureResponse featureResponse = getFeatureResponse(feature);
				PersistedFeature persistedFeature = getPersistedFeature(feature);
				featureResponseList.add(featureResponse);
				persistedFeatureList.put(persistedFeature.getId(),persistedFeature);
			}
		}
	}

	private FeatureResponse getFeatureResponse(Feature feature) {
		FeatureResponse featureResponse = new FeatureResponse();
		setFeatureValue(feature, featureResponse);

		return featureResponse;
	}

	private void setFeatureValue(Feature feature, FeatureResponse featureResponse) {
		if (feature.getProperties() != null) {
			featureResponse.setId(feature.getProperties().getId());
			featureResponse.setTimestamp(feature.getProperties().getTimestamp());
			if (feature.getProperties().getAcquisition() != null) {
				featureResponse.setBeginViewingDate(feature.getProperties().getAcquisition().getBeginViewingDate());
				featureResponse.setEndViewingDate(feature.getProperties().getAcquisition().getEndViewingDate());
				featureResponse.setMissionName(feature.getProperties().getAcquisition().getMissionName());
			}

		}
	}

	private PersistedFeature getPersistedFeature(Feature feature) {
		PersistedFeature persistedFeature = new PersistedFeature();
		setPerssistedFeatureValue(feature, persistedFeature);

		return persistedFeature;
	}

	private void setPerssistedFeatureValue(Feature feature, PersistedFeature persistedFeature) {
		if (feature.getProperties() != null) {
			persistedFeature.setId(feature.getProperties().getId());
			persistedFeature.setTimestamp(feature.getProperties().getTimestamp());
			if (feature.getProperties().getAcquisition() != null) {
				persistedFeature.setBeginViewingDate(feature.getProperties().getAcquisition().getBeginViewingDate());
				persistedFeature.setEndViewingDate(feature.getProperties().getAcquisition().getEndViewingDate());
				persistedFeature.setMissionName(feature.getProperties().getAcquisition().getMissionName());
			}

			persistedFeature.setQuickLook(feature.getProperties().getQuicklook());

		}
	}
}
