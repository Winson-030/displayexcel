package com.winson.showexcel.Utils;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TempData {
    private Integer uid;
    private String sampleId;

    private String surveyShip;

    private String voyageNumber;

    private String seaArea;

    private String locationArea;

    private Float coordinateX;

    private Float coordinateY;

    private String detailAddress;

    private BigDecimal endDepth;

    private BigDecimal drillerLength;

    private String storageLocation;

    private Float storageCondition;

    private String remark;



}
