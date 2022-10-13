
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
    "search_date_string",
    "search_quality_string",
    "search_cloud_string",
    "search_incidence_angle_string"
})
@Generated("jsonschema2pojo")
public class Naturallanguage implements Serializable
{

    @JsonProperty("search_date_string")
    private String searchDateString;
    @JsonProperty("search_quality_string")
    private String searchQualityString;
    @JsonProperty("search_cloud_string")
    private String searchCloudString;
    @JsonProperty("search_incidence_angle_string")
    private String searchIncidenceAngleString;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6143901476289655592L;

    @JsonProperty("search_date_string")
    public String getSearchDateString() {
        return searchDateString;
    }

    @JsonProperty("search_date_string")
    public void setSearchDateString(String searchDateString) {
        this.searchDateString = searchDateString;
    }

    @JsonProperty("search_quality_string")
    public String getSearchQualityString() {
        return searchQualityString;
    }

    @JsonProperty("search_quality_string")
    public void setSearchQualityString(String searchQualityString) {
        this.searchQualityString = searchQualityString;
    }

    @JsonProperty("search_cloud_string")
    public String getSearchCloudString() {
        return searchCloudString;
    }

    @JsonProperty("search_cloud_string")
    public void setSearchCloudString(String searchCloudString) {
        this.searchCloudString = searchCloudString;
    }

    @JsonProperty("search_incidence_angle_string")
    public String getSearchIncidenceAngleString() {
        return searchIncidenceAngleString;
    }

    @JsonProperty("search_incidence_angle_string")
    public void setSearchIncidenceAngleString(String searchIncidenceAngleString) {
        this.searchIncidenceAngleString = searchIncidenceAngleString;
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
