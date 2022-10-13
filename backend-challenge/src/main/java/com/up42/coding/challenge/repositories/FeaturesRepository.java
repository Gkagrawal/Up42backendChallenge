package com.up42.coding.challenge.repositories;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.up42.coding.challenge.constants.FeaturesConstants;
import com.up42.coding.challenge.model.responseModel.PersistedFeature;

@Repository
public class FeaturesRepository {

    Logger logger = LoggerFactory.getLogger(FeaturesRepository.class);

    public boolean saveToJson(List<PersistedFeature> persistedFeatureList) throws IOException {
        logger.info("Inside {} method of {}","persistedFeatureList",this.getClass());
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(FeaturesConstants.PERSISTED_DATA_FILE_PATH), persistedFeatureList);
        }
        catch (IOException e){
            logger.error("Feature list could not be persisted : " + e.getMessage());
            throw e;
        }
        return true;
    }

    public List<PersistedFeature> getPersistedFeatureList() throws IOException {
        logger.info("Inside {} method of {}","getPersistedFeatureList",this.getClass());
        ObjectMapper objectMapper = new ObjectMapper();
        List<PersistedFeature> persistedFeatureList = null;
        try {
            persistedFeatureList = objectMapper.readValue(new File(FeaturesConstants.PERSISTED_DATA_FILE_PATH), new TypeReference<List<PersistedFeature>>(){});
        }
        catch (IOException e) {
            logger.error("Error in reading the persisted file : " + e.getMessage());
            throw e;
        }
        return persistedFeatureList;
    }
}
