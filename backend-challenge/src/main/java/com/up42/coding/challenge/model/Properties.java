
package com.up42.coding.challenge.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "timestamp",
    "centroid",
    "visibility",
    "illumination",
    "production",
    "archive",
    "spatialCoverage",
    "timeStamp",
    "uid",
    "enrichment",
    "identification",
    "transmission",
    "contentDescription",
    "acquisition",
    "orbit",
    "state",
    "attitude",
    "quicklook"
})
@Generated("jsonschema2pojo")
public class Properties implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("timestamp")
    private Long timestamp;
    @JsonProperty("centroid")
    private Centroid centroid;
    @JsonProperty("visibility")
    private Visibility visibility;
    @JsonProperty("illumination")
    private Illumination illumination;
    @JsonProperty("production")
    private Production production;
    @JsonProperty("archive")
    private Archive archive;
    @JsonProperty("spatialCoverage")
    private SpatialCoverage spatialCoverage;
    @JsonProperty("timeStamp")
    private Long timeStamp;
    @JsonProperty("uid")
    private String uid;
    @JsonProperty("enrichment")
    private Enrichment enrichment;
    @JsonProperty("identification")
    private Identification identification;
    @JsonProperty("transmission")
    private Transmission transmission;
    @JsonProperty("contentDescription")
    private ContentDescription contentDescription;
    @JsonProperty("acquisition")
    private Acquisition acquisition;
    @JsonProperty("orbit")
    private Orbit orbit;
    @JsonProperty("state")
    private State state;
    @JsonProperty("attitude")
    private Attitude attitude;
    @JsonProperty("quicklook")
    private String quicklook;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2280748795405096145L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("centroid")
    public Centroid getCentroid() {
        return centroid;
    }

    @JsonProperty("centroid")
    public void setCentroid(Centroid centroid) {
        this.centroid = centroid;
    }

    @JsonProperty("visibility")
    public Visibility getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("illumination")
    public Illumination getIllumination() {
        return illumination;
    }

    @JsonProperty("illumination")
    public void setIllumination(Illumination illumination) {
        this.illumination = illumination;
    }

    @JsonProperty("production")
    public Production getProduction() {
        return production;
    }

    @JsonProperty("production")
    public void setProduction(Production production) {
        this.production = production;
    }

    @JsonProperty("archive")
    public Archive getArchive() {
        return archive;
    }

    @JsonProperty("archive")
    public void setArchive(Archive archive) {
        this.archive = archive;
    }

    @JsonProperty("spatialCoverage")
    public SpatialCoverage getSpatialCoverage() {
        return spatialCoverage;
    }

    @JsonProperty("spatialCoverage")
    public void setSpatialCoverage(SpatialCoverage spatialCoverage) {
        this.spatialCoverage = spatialCoverage;
    }

    @JsonProperty("timeStamp")
    public Long getTimeStamp() {
        return timeStamp;
    }

    @JsonProperty("timeStamp")
    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("enrichment")
    public Enrichment getEnrichment() {
        return enrichment;
    }

    @JsonProperty("enrichment")
    public void setEnrichment(Enrichment enrichment) {
        this.enrichment = enrichment;
    }

    @JsonProperty("identification")
    public Identification getIdentification() {
        return identification;
    }

    @JsonProperty("identification")
    public void setIdentification(Identification identification) {
        this.identification = identification;
    }

    @JsonProperty("transmission")
    public Transmission getTransmission() {
        return transmission;
    }

    @JsonProperty("transmission")
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @JsonProperty("contentDescription")
    public ContentDescription getContentDescription() {
        return contentDescription;
    }

    @JsonProperty("contentDescription")
    public void setContentDescription(ContentDescription contentDescription) {
        this.contentDescription = contentDescription;
    }

    @JsonProperty("acquisition")
    public Acquisition getAcquisition() {
        return acquisition;
    }

    @JsonProperty("acquisition")
    public void setAcquisition(Acquisition acquisition) {
        this.acquisition = acquisition;
    }

    @JsonProperty("orbit")
    public Orbit getOrbit() {
        return orbit;
    }

    @JsonProperty("orbit")
    public void setOrbit(Orbit orbit) {
        this.orbit = orbit;
    }

    @JsonProperty("state")
    public State getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(State state) {
        this.state = state;
    }

    @JsonProperty("attitude")
    public Attitude getAttitude() {
        return attitude;
    }

    @JsonProperty("attitude")
    public void setAttitude(Attitude attitude) {
        this.attitude = attitude;
    }

    @JsonProperty("quicklook")
    public String getQuicklook() {
        return quicklook;
    }

    @JsonProperty("quicklook")
    public void setQuicklook(String quicklook) {
        this.quicklook = quicklook;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
