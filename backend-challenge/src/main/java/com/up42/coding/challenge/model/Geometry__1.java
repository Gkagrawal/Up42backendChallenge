
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
    "geographicBoundingPolygon",
    "global",
    "centerPoint"
})
@Generated("jsonschema2pojo")
public class Geometry__1 implements Serializable
{

    @JsonProperty("geographicBoundingPolygon")
    private GeographicBoundingPolygon geographicBoundingPolygon;
    @JsonProperty("global")
    private Boolean global;
    @JsonProperty("centerPoint")
    private CenterPoint centerPoint;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8913335423199016853L;

    @JsonProperty("geographicBoundingPolygon")
    public GeographicBoundingPolygon getGeographicBoundingPolygon() {
        return geographicBoundingPolygon;
    }

    @JsonProperty("geographicBoundingPolygon")
    public void setGeographicBoundingPolygon(GeographicBoundingPolygon geographicBoundingPolygon) {
        this.geographicBoundingPolygon = geographicBoundingPolygon;
    }

    @JsonProperty("global")
    public Boolean getGlobal() {
        return global;
    }

    @JsonProperty("global")
    public void setGlobal(Boolean global) {
        this.global = global;
    }

    @JsonProperty("centerPoint")
    public CenterPoint getCenterPoint() {
        return centerPoint;
    }

    @JsonProperty("centerPoint")
    public void setCenterPoint(CenterPoint centerPoint) {
        this.centerPoint = centerPoint;
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
