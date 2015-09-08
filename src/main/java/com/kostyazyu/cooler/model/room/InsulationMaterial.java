package com.kostyazyu.cooler.model.room;

public class InsulationMaterial {
    private int id;
    private String name;
    private double heatConductionCoefficient_W_mK = 1d;

    public InsulationMaterial() {
    }

    public InsulationMaterial(double heatConductionCoefficient_W_mK) {
        this.heatConductionCoefficient_W_mK = heatConductionCoefficient_W_mK;
    }
}

