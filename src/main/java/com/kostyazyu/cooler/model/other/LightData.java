package com.kostyazyu.cooler.model.other;

public class LightData {
    private int activePeriod_h;
    private int lightPower_W_m2;

    public LightData() {
    }

    public LightData(int activePeriod_h, int lightPower_W_m2) {
        this.activePeriod_h = activePeriod_h;
        this.lightPower_W_m2 = lightPower_W_m2;
    }

    public int getActivePeriod_h() {
        return activePeriod_h;
    }

    public void setActivePeriod_h(int activePeriod_h) {
        this.activePeriod_h = activePeriod_h;
    }

    public int getLightPower_W_m2() {
        return lightPower_W_m2;
    }

    public void setLightPower_W_m2(int lightPower_W_m2) {
        this.lightPower_W_m2 = lightPower_W_m2;
    }
}
