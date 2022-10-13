package com.up42.coding.challenge.repositories;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;

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

    public boolean persistData(HashMap<String, PersistedFeature> persistedFeatureMap) throws IOException {
        logger.info("Inside {} method of {}","persistedFeatureList",this.getClass());
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(FeaturesConstants.PERSISTED_DATA_FILE_PATH), persistedFeatureMap);
        }
        catch (IOException e){
            logger.error("Feature list could not be persisted : " + e.getMessage());
            throw e;
        }
        return true;
    }

    public HashMap<String, PersistedFeature> getPersistedFeatureMap() {
        logger.info("Inside {} method of {}","getPersistedFeatureList",this.getClass());
        ObjectMapper objectMapper = new ObjectMapper();
        HashMap<String, PersistedFeature> persistedFeatureMap = null;
        try {
        	persistedFeatureMap = objectMapper.readValue(new File(FeaturesConstants.PERSISTED_DATA_FILE_PATH), new TypeReference<HashMap<String, PersistedFeature>>(){});
        }
        catch (IOException e) {
            logger.error("Error in reading the persisted file : " + e.getMessage());
        }
        return persistedFeatureMap;
    }
}
