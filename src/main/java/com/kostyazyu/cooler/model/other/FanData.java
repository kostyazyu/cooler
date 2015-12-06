package com.kostyazyu.cooler.model.other;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class FanData {

    @NotNull
    @Column(name = "fanQuantity")
    private Integer fanQuantity;

    @NotNull
    @Column(name = "fanPowerKW")
    private Double fanPowerKW;

    public FanData() {
    }

    public FanData(Integer fanQuantity, Double fanPowerKW) {
        this.fanQuantity = fanQuantity;
        this.fanPowerKW = fanPowerKW;
    }

    public Integer getFanQuantity() {
        return fanQuantity;
    }

    public void setFanQuantity(Integer fanQuantity) {
        this.fanQuantity = fanQuantity;
    }

    public Double getFanPowerKW() {
        return fanPowerKW;
    }

    public void setFanPowerKW(Double fanPowerKW) {
        this.fanPowerKW = fanPowerKW;
    }
}
