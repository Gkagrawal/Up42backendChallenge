package com.up42.coding.challenge.services;

import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.doReturn;

import java.io.IOException;
import java.util.ArrayList;
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
		doReturn(true).when(featuresRepository).saveToJson(anyList());
		List<FeatureResponse> featuresList = featuresService.getFeatures();
		Assertions.assertThat(featuresList).isNotNull();
	}

	@Test
	void getImagePositiveTestCase() throws IOException {
		List<PersistedFeature> persistedFeatureList = dataProvider("Dummy Id");
		doReturn(persistedFeatureList).when(featuresRepository).getPersistedFeatureList();
		byte[] byteImage = featuresService.getImage("Dummy Id");
		Assertions.assertThat(byteImage).isNotNull();
	}

	@Test
	void getImageNegativeTestCase() throws IOException {
		List<PersistedFeature> persistedFeatureList = dataProvider("Dummy Id");
		doReturn(persistedFeatureList).when(featuresRepository).getPersistedFeatureList();
		byte[] byteImage = featuresService.getImage("Wrong Dummy Id");
		Assertions.assertThat(byteImage).isNull();
	}

	private List<PersistedFeature> dataProvider(String featureId) {
		List<PersistedFeature> persistedFeatureList = new ArrayList<>();
		PersistedFeature feature = new PersistedFeature();
		feature.setId(featureId);
		feature.setQuickLook("xyz");
		persistedFeatureList.add(feature);
		return persistedFeatureList;
	}
}