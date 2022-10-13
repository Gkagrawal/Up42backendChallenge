
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
    "naturallanguage"
})
@Generated("jsonschema2pojo")
public class Enrichment implements Serializable
{

    @JsonProperty("naturallanguage")
    private Naturallanguage naturallanguage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7555511603980803339L;

    @JsonProperty("naturallanguage")
    public Naturallanguage getNaturallanguage() {
        return naturallanguage;
    }

    @JsonProperty("naturallanguage")
    public void setNaturallanguage(Naturallanguage naturallanguage) {
        this.naturallanguage = naturallanguage;
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
