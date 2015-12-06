package com.kostyazyu.cooler.model.other;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class LightData {

    @NotNull
    @Column(name = "activePeriodH")
    private Integer activePeriodH;

    @NotNull
    @Column(name = "lightPowerWperM2")
    private Integer lightPowerWperM2;

    public LightData() {
    }

    public LightData(Integer activePeriodH, Integer lightPowerWperM2) {
        this.activePeriodH = activePeriodH;
        this.lightPowerWperM2 = lightPowerWperM2;
    }

    public Integer getActivePeriodH() {
        return activePeriodH;
    }

    public void setActivePeriodH(Integer activePeriodH) {
        this.activePeriodH = activePeriodH;
    }

    public Integer getLightPowerWperM2() {
        return lightPowerWperM2;
    }

    public void setLightPowerWperM2(Integer lightPowerWperM2) {
        this.lightPowerWperM2 = lightPowerWperM2;
    }
}
