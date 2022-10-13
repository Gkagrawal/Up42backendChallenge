
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
    "thumbnail",
    "quicklook"
})
@Generated("jsonschema2pojo")
public class Resources implements Serializable
{

    @JsonProperty("thumbnail")
    private Boolean thumbnail;
    @JsonProperty("quicklook")
    private Boolean quicklook;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3839978537919915514L;

    @JsonProperty("thumbnail")
    public Boolean getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(Boolean thumbnail) {
        this.thumbnail = thumbnail;
    }

    @JsonProperty("quicklook")
    public Boolean getQuicklook() {
        return quicklook;
    }

    @JsonProperty("quicklook")
    public void setQuicklook(Boolean quicklook) {
        this.quicklook = quicklook;
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
