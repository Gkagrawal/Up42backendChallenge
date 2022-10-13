package com.up42.coding.challenge.services;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.up42.coding.challenge.model.responseModel.FeatureResponse;
import com.up42.coding.challenge.model.responseModel.PersistedFeature;
import com.up42.coding.challenge.repositories.FeaturesRepository;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FeaturesServiceTest {

	@InjectMocks
	private FeaturesService featuresService;

	@Mock
	private FeaturesRepository featuresRepository;

	@BeforeAll
	public void initialize() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void getFeatures() throws IOException {
		doReturn(true).when(featuresRepository).persistData(any());
		List<FeatureResponse> featuresList = featuresService.getFeatures();
		Assertions.assertThat(featuresList).isNotNull();
	}

	@Test
	void getImagePositiveTestCase() throws IOException {
		HashMap<String,PersistedFeature> persistedFeatureMap = dataProvider("Dummy Id");
		doReturn(persistedFeatureMap).when(featuresRepository).getPersistedFeatureMap();
		byte[] byteImage = featuresService.getImage("Dummy Id");
		Assertions.assertThat(byteImage).isNotNull();
	}

	@Test
	void getImageNegativeTestCase() throws IOException {
		HashMap<String,PersistedFeature> persistedFeatureMap = dataProvider("Dummy Id");
		doReturn(persistedFeatureMap).when(featuresRepository).getPersistedFeatureMap();
		byte[] byteImage = featuresService.getImage("Wrong Dummy Id");
		Assertions.assertThat(byteImage).isNull();
	}
	
	@Test
	void getImageNegativeTestCaseWithNull() throws IOException {
		HashMap<String,PersistedFeature> persistedFeatureMap = nulldataProvider("Dummy Id");
		doReturn(persistedFeatureMap).when(featuresRepository).getPersistedFeatureMap();
		byte[] byteImage = featuresService.getImage("Dummy Id");
		Assertions.assertThat(byteImage).isNull();
	}

	private HashMap<String,PersistedFeature> dataProvider(String featureId) {
		HashMap<String,PersistedFeature> persistedFeatureMap = new HashMap<>();
		PersistedFeature feature = new PersistedFeature();
		feature.setId(featureId);
		feature.setQuickLook("xyz");
		persistedFeatureMap.put(featureId,feature);
		return persistedFeatureMap;
	}
	private HashMap<String,PersistedFeature> nulldataProvider(String featureId) {
		HashMap<String,PersistedFeature> persistedFeatureMap = new HashMap<>();
		PersistedFeature feature = new PersistedFeature();
		feature.setId(featureId);
		feature.setQuickLook(null);
		persistedFeatureMap.put(featureId,feature);
		return persistedFeatureMap;
	}
}