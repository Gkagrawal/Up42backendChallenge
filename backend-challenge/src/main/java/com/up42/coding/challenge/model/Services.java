
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
    "wmts",
    "download",
    "wcs",
    "wms"
})
@Generated("jsonschema2pojo")
public class Services implements Serializable
{

    @JsonProperty("wmts")
    private Boolean wmts;
    @JsonProperty("download")
    private String download;
    @JsonProperty("wcs")
    private Boolean wcs;
    @JsonProperty("wms")
    private Boolean wms;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7218778896146473030L;

    @JsonProperty("wmts")
    public Boolean getWmts() {
        return wmts;
    }

    @JsonProperty("wmts")
    public void setWmts(Boolean wmts) {
        this.wmts = wmts;
    }

    @JsonProperty("download")
    public String getDownload() {
        return download;
    }

    @JsonProperty("download")
    public void setDownload(String download) {
        this.download = download;
    }

    @JsonProperty("wcs")
    public Boolean getWcs() {
        return wcs;
    }

    @JsonProperty("wcs")
    public void setWcs(Boolean wcs) {
        this.wcs = wcs;
    }

    @JsonProperty("wms")
    public Boolean getWms() {
        return wms;
    }

    @JsonProperty("wms")
    public void setWms(Boolean wms) {
        this.wms = wms;
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
