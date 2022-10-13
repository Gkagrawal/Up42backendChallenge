
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
    "offLine",
    "size",
    "onLine"
})
@Generated("jsonschema2pojo")
public class Archive implements Serializable
{

    @JsonProperty("offLine")
    private Boolean offLine;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("onLine")
    private Boolean onLine;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4492386453379684486L;

    @JsonProperty("offLine")
    public Boolean getOffLine() {
        return offLine;
    }

    @JsonProperty("offLine")
    public void setOffLine(Boolean offLine) {
        this.offLine = offLine;
    }

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonProperty("onLine")
    public Boolean getOnLine() {
        return onLine;
    }

    @JsonProperty("onLine")
    public void setOnLine(Boolean onLine) {
        this.onLine = onLine;
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
