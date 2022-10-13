
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
    "endViewingDate",
    "mission",
    "missionId",
    "missionCode",
    "beginViewingDate",
    "missionName",
    "polarization",
    "sensorMode",
    "sensorId"
})
@Generated("jsonschema2pojo")
public class Acquisition implements Serializable
{

    @JsonProperty("endViewingDate")
    private Long endViewingDate;
    @JsonProperty("mission")
    private String mission;
    @JsonProperty("missionId")
    private String missionId;
    @JsonProperty("missionCode")
    private String missionCode;
    @JsonProperty("beginViewingDate")
    private Long beginViewingDate;
    @JsonProperty("missionName")
    private String missionName;
    @JsonProperty("polarization")
    private String polarization;
    @JsonProperty("sensorMode")
    private String sensorMode;
    @JsonProperty("sensorId")
    private String sensorId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8513444082115000416L;

    @JsonProperty("endViewingDate")
    public Long getEndViewingDate() {
        return endViewingDate;
    }

    @JsonProperty("endViewingDate")
    public void setEndViewingDate(Long endViewingDate) {
        this.endViewingDate = endViewingDate;
    }

    @JsonProperty("mission")
    public String getMission() {
        return mission;
    }

    @JsonProperty("mission")
    public void setMission(String mission) {
        this.mission = mission;
    }

    @JsonProperty("missionId")
    public String getMissionId() {
        return missionId;
    }

    @JsonProperty("missionId")
    public void setMissionId(String missionId) {
        this.missionId = missionId;
    }

    @JsonProperty("missionCode")
    public String getMissionCode() {
        return missionCode;
    }

    @JsonProperty("missionCode")
    public void setMissionCode(String missionCode) {
        this.missionCode = missionCode;
    }

    @JsonProperty("beginViewingDate")
    public Long getBeginViewingDate() {
        return beginViewingDate;
    }

    @JsonProperty("beginViewingDate")
    public void setBeginViewingDate(Long beginViewingDate) {
        this.beginViewingDate = beginViewingDate;
    }

    @JsonProperty("missionName")
    public String getMissionName() {
        return missionName;
    }

    @JsonProperty("missionName")
    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    @JsonProperty("polarization")
    public String getPolarization() {
        return polarization;
    }

    @JsonProperty("polarization")
    public void setPolarization(String polarization) {
        this.polarization = polarization;
    }

    @JsonProperty("sensorMode")
    public String getSensorMode() {
        return sensorMode;
    }

    @JsonProperty("sensorMode")
    public void setSensorMode(String sensorMode) {
        this.sensorMode = sensorMode;
    }

    @JsonProperty("sensorId")
    public String getSensorId() {
        return sensorId;
    }

    @JsonProperty("sensorId")
    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
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
