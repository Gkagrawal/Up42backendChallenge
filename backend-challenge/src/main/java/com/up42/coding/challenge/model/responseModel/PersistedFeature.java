package com.up42.coding.challenge.model.responseModel;

public class PersistedFeature {
    private String id;
    private Long timestamp;
    private Long beginViewingDate;
    private Long endViewingDate;
    private String missionName;

    private String quickLook;

    @Override
    public String toString() {
        return "PersistedFeature{" +
                "id='" + id + '\'' +
                ", timestamp=" + timestamp +
                ", beginViewingDate=" + beginViewingDate +
                ", endViewingDate=" + endViewingDate +
                ", missionName='" + missionName + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getBeginViewingDate() {
        return beginViewingDate;
    }

    public void setBeginViewingDate(Long beginViewingDate) {
        this.beginViewingDate = beginViewingDate;
    }

    public Long getEndViewingDate() {
        return endViewingDate;
    }

    public void setEndViewingDate(Long endViewingDate) {
        this.endViewingDate = endViewingDate;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }


    public String getQuickLook() {
        return quickLook;
    }

    public void setQuickLook(String quickLook) {
        this.quickLook = quickLook;
    }
}
