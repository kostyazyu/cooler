package com.kostyazyu.cooler.model.room;

public class InsulatedBarrier {
    private double inTemperature_C;
    private double outTemperature_C;
    private double x_m;
    private double y_m;
    private Insulation firstInsulation;
    private Insulation secondInsulation;

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

    public double getInTemperature_C() {
        return inTemperature_C;
    }

    public void setInTemperature_C(double inTemperature_C) {
        this.inTemperature_C = inTemperature_C;
    }

    public double getOutTemperature_C() {
        return outTemperature_C;
    }

    public void setOutTemperature_C(double outTemperature_C) {
        this.outTemperature_C = outTemperature_C;
    }

    public double getX_m() {
        return x_m;
    }

    public void setX_m(double x_m) {
        this.x_m = x_m;
    }

    public double getY_m() {
        return y_m;
    }

    public void setY_m(double y_m) {
        this.y_m = y_m;
    }

    public Insulation getFirstInsulation() {
        return firstInsulation;
    }

    public void setFirstInsulation(Insulation firstInsulation) {
        this.firstInsulation = firstInsulation;
    }

    public Insulation getSecondInsulation() {
        return secondInsulation;
    }

    public void setSecondInsulation(Insulation secondInsulation) {
        this.secondInsulation = secondInsulation;
    }
}
