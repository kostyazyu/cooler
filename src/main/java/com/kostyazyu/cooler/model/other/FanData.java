package com.kostyazyu.cooler.model.other;

public class FanData {
    private int fanQuantity;
    private double fanPower_kW;

    public FanData() {
    }

    public FanData(int fanQuantity, double fanPower_kW) {
        this.fanQuantity = fanQuantity;
        this.fanPower_kW = fanPower_kW;
    }

    public int getFanQuantity() {
        return fanQuantity;
    }

    public void setFanQuantity(int fanQuantity) {
        this.fanQuantity = fanQuantity;
    }

    public double getFanPower_kW() {
        return fanPower_kW;
    }

    public void setFanPower_kW(double fanPower_kW) {
        this.fanPower_kW = fanPower_kW;
    }
}
