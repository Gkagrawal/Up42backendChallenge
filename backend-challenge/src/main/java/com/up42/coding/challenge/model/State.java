
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
    "resources",
    "services",
    "insertionDate"
})
@Generated("jsonschema2pojo")
public class State implements Serializable
{

    @JsonProperty("resources")
    private Resources resources;
    @JsonProperty("services")
    private Services services;
    @JsonProperty("insertionDate")
    private Long insertionDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2026238259800527908L;

    @JsonProperty("resources")
    public Resources getResources() {
        return resources;
    }

    @JsonProperty("resources")
    public void setResources(Resources resources) {
        this.resources = resources;
    }

    @JsonProperty("services")
    public Services getServices() {
        return services;
    }

    @JsonProperty("services")
    public void setServices(Services services) {
        this.services = services;
    }

    @JsonProperty("insertionDate")
    public Long getInsertionDate() {
        return insertionDate;
    }

    @JsonProperty("insertionDate")
    public void setInsertionDate(Long insertionDate) {
        this.insertionDate = insertionDate;
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
