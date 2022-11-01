package com.winson.showexcel.Entity;

public class TbSample {
    private Integer id;

    private Integer no;

    private String sampleId;

    private String surveyShip;

    private String voyageNumber;

    private Double endDepth;

    private Double drillerLength;

    private String storageLocation;

    private Double storageCondition;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getSampleId() {
        return sampleId;
    }

    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
    }

    public String getSurveyShip() {
        return surveyShip;
    }

    public void setSurveyShip(String surveyShip) {
        this.surveyShip = surveyShip;
    }

    public String getVoyageNumber() {
        return voyageNumber;
    }

    public void setVoyageNumber(String voyageNumber) {
        this.voyageNumber = voyageNumber;
    }

    public Double getEndDepth() {
        return endDepth;
    }

    public void setEndDepth(Double endDepth) {
        this.endDepth = endDepth;
    }

    public Double getDrillerLength() {
        return drillerLength;
    }

    public void setDrillerLength(Double drillerLength) {
        this.drillerLength = drillerLength;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public Double getStorageCondition() {
        return storageCondition;
    }

    public void setStorageCondition(Double storageCondition) {
        this.storageCondition = storageCondition;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", no=").append(no);
        sb.append(", sampleId=").append(sampleId);
        sb.append(", surveyShip=").append(surveyShip);
        sb.append(", voyageNumber=").append(voyageNumber);
        sb.append(", endDepth=").append(endDepth);
        sb.append(", drillerLength=").append(drillerLength);
        sb.append(", storageLocation=").append(storageLocation);
        sb.append(", storageCondition=").append(storageCondition);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}