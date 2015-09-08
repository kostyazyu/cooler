package com.kostyazyu.cooler.model.room;

public class InsulatedBarrier {
    private double inTemperature_C;
    private double outTemperature_C;
    private double x_m;
    private double y_m;
    private Insulation firstInsulation;
    private Insulation secondInsulation;
    private double heatConsumption_W = 0d;

    public InsulatedBarrier() {
    }

    public InsulatedBarrier(double inTemperature_C, double outTemperature_C, double x_m, double y_m) {
        this.inTemperature_C = inTemperature_C;
        this.outTemperature_C = outTemperature_C;
        this.x_m = x_m;
        this.y_m = y_m;
        firstInsulation = new Insulation();
        secondInsulation = new Insulation();
    }
}
