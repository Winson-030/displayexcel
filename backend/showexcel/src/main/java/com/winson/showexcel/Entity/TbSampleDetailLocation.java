package com.winson.showexcel.Entity;

public class TbSampleDetailLocation {
    private Integer id;

    private String sampleId;

    private String seaArea;

    private String locationArea;

    private Double coordinateX;

    private Double coordinateY;

    private String detailAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSampleId() {
        return sampleId;
    }

    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
    }

    public String getSeaArea() {
        return seaArea;
    }

    public void setSeaArea(String seaArea) {
        this.seaArea = seaArea;
    }

    public String getLocationArea() {
        return locationArea;
    }

    public void setLocationArea(String locationArea) {
        this.locationArea = locationArea;
    }

    public Double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(Double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public Double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(Double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sampleId=").append(sampleId);
        sb.append(", seaArea=").append(seaArea);
        sb.append(", locationArea=").append(locationArea);
        sb.append(", coordinateX=").append(coordinateX);
        sb.append(", coordinateY=").append(coordinateY);
        sb.append(", detailAddress=").append(detailAddress);
        sb.append("]");
        return sb.toString();
    }
}