package com.kostyazyu.cooler.model.other;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class EquipmentData {

    @NotNull
    @Column(name = "")
    private Integer summaryPowerKW;

    @NotNull
    @Column(name = "")
    private Double activityCoefficientDF; // decimal fraction

    public EquipmentData() {
    }

    public EquipmentData(Integer summaryPowerKW,
                         Double activityCoefficientDF) {
        this.summaryPowerKW = summaryPowerKW;
        this.activityCoefficientDF = activityCoefficientDF;
    }

    public Integer getSummaryPowerKW() {
        return summaryPowerKW;
    }

    public void setSummaryPowerKW(Integer summaryPowerKW) {
        this.summaryPowerKW = summaryPowerKW;
    }

    public Double getActivityCoefficientDF() {
        return activityCoefficientDF;
    }

    public void setActivityCoefficientDF(Double activityCoefficientDF) {
        this.activityCoefficientDF = activityCoefficientDF;
    }
}
