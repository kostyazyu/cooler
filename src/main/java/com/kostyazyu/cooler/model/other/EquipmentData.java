package com.kostyazyu.cooler.model.other;

public class EquipmentData {
    private int summaryPower_kW;
    private double activityCoefficient_df; // decimal fraction

    public EquipmentData() {
    }

    public EquipmentData(int summaryPower_kW,
                         double activityCoefficient_df) {
        this.summaryPower_kW = summaryPower_kW;
        this.activityCoefficient_df = activityCoefficient_df;
    }

    public int getSummaryPower_kW() {
        return summaryPower_kW;
    }

    public void setSummaryPower_kW(int summaryPower_kW) {
        this.summaryPower_kW = summaryPower_kW;
    }

    public double getActivityCoefficient_df() {
        return activityCoefficient_df;
    }

    public void setActivityCoefficient_df(double activityCoefficient_df) {
        this.activityCoefficient_df = activityCoefficient_df;
    }
}
