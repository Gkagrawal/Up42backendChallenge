package com.up42.coding.challenge.webApi;



import java.io.IOException;
import java.util.List;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.up42.coding.challenge.constants.FeaturesConstants;
import com.up42.coding.challenge.model.responseModel.FeatureResponse;
import com.up42.coding.challenge.repositories.FeaturesRepository;
import com.up42.coding.challenge.services.FeaturesService;

@RestController
public class FeaturesController {

    Logger logger = LoggerFactory.getLogger(FeaturesController.class);

    @Autowired
    private FeaturesRepository repository;

    @Autowired
    private FeaturesService featuresService;

    @GetMapping("/features")
    public List<FeatureResponse> getFeatures() throws IOException {
        logger.info("Inside {} method of {}","getFeatures",this.getClass());
        List<FeatureResponse> featureResponseList = featuresService.getFeatures();
        return featureResponseList;
    }

    @GetMapping("/features/{featureId}/quicklook")
    public HttpEntity<byte[]> getImage(@PathVariable String featureId) throws IOException {
        logger.info("Inside {} method of {}","getImage",this.getClass());
        byte [] image = featuresService.getImage(featureId);

        if(Objects.nonNull(image)) {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_JPEG);
            headers.setContentLength(image.length);
            return new HttpEntity<>(image, headers);
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(FeaturesConstants.GET_IMAGE_ERR_MSG.getBytes());
        }
    }

}
