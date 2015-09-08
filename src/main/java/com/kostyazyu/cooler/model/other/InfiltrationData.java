package com.kostyazyu.cooler.model.other;

public class InfiltrationData {
    private double height_m;
    private double width_m;
    private double openCoefficient_df; //decimal fraction
    private double curtainCoefficient_df; //decimal fraction
    // TODO automatic door

    public InfiltrationData() {
    }

    public InfiltrationData(double height_m,
                            double width_m,
                            double openCoefficient_df,
                            double curtainCoefficient_df) {
        this.height_m = height_m;
        this.width_m = width_m;
        this.openCoefficient_df = openCoefficient_df;
        this.curtainCoefficient_df = curtainCoefficient_df;
    }
}
