
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
    "verticality",
    "geometry"
})
@Generated("jsonschema2pojo")
public class SpatialCoverage implements Serializable
{

    @JsonProperty("verticality")
    private Verticality verticality;
    @JsonProperty("geometry")
    private Geometry__1 geometry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -887957430794168598L;

    @JsonProperty("verticality")
    public Verticality getVerticality() {
        return verticality;
    }

    @JsonProperty("verticality")
    public void setVerticality(Verticality verticality) {
        this.verticality = verticality;
    }

    @JsonProperty("geometry")
    public Geometry__1 getGeometry() {
        return geometry;
    }

    @JsonProperty("geometry")
    public void setGeometry(Geometry__1 geometry) {
        this.geometry = geometry;
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
