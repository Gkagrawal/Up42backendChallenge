
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
    "levelCode",
    "ongoing"
})
@Generated("jsonschema2pojo")
public class Production implements Serializable
{

    @JsonProperty("levelCode")
    private String levelCode;
    @JsonProperty("ongoing")
    private Boolean ongoing;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 147676732878238993L;

    @JsonProperty("levelCode")
    public String getLevelCode() {
        return levelCode;
    }

    @JsonProperty("levelCode")
    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    @JsonProperty("ongoing")
    public Boolean getOngoing() {
        return ongoing;
    }

    @JsonProperty("ongoing")
    public void setOngoing(Boolean ongoing) {
        this.ongoing = ongoing;
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
