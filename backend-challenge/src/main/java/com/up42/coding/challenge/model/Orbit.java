
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
    "relativeNumber",
    "direction"
})
@Generated("jsonschema2pojo")
public class Orbit implements Serializable
{

    @JsonProperty("relativeNumber")
    private Integer relativeNumber;
    @JsonProperty("direction")
    private String direction;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5442576286685482374L;

    @JsonProperty("relativeNumber")
    public Integer getRelativeNumber() {
        return relativeNumber;
    }

    @JsonProperty("relativeNumber")
    public void setRelativeNumber(Integer relativeNumber) {
        this.relativeNumber = relativeNumber;
    }

    @JsonProperty("direction")
    public String getDirection() {
        return direction;
    }

    @JsonProperty("direction")
    public void setDirection(String direction) {
        this.direction = direction;
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
