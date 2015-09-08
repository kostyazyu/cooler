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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeatConductionCoefficient_W_mK() {
        return heatConductionCoefficient_W_mK;
    }

    public void setHeatConductionCoefficient_W_mK(double heatConductionCoefficient_W_mK) {
        this.heatConductionCoefficient_W_mK = heatConductionCoefficient_W_mK;
    }
}

