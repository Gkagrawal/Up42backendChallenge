
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
    "profile",
    "externalId",
    "collection",
    "type",
    "dataset"
})
@Generated("jsonschema2pojo")
public class Identification implements Serializable
{

    @JsonProperty("profile")
    private String profile;
    @JsonProperty("externalId")
    private String externalId;
    @JsonProperty("collection")
    private String collection;
    @JsonProperty("type")
    private String type;
    @JsonProperty("dataset")
    private Dataset dataset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7749730162532380646L;

    @JsonProperty("profile")
    public String getProfile() {
        return profile;
    }

    @JsonProperty("profile")
    public void setProfile(String profile) {
        this.profile = profile;
    }

    @JsonProperty("externalId")
    public String getExternalId() {
        return externalId;
    }

    @JsonProperty("externalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @JsonProperty("collection")
    public String getCollection() {
        return collection;
    }

    @JsonProperty("collection")
    public void setCollection(String collection) {
        this.collection = collection;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("dataset")
    public Dataset getDataset() {
        return dataset;
    }

    @JsonProperty("dataset")
    public void setDataset(Dataset dataset) {
        this.dataset = dataset;
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
