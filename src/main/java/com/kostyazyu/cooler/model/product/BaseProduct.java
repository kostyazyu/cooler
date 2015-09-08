package com.kostyazyu.cooler.model.product;

public abstract class BaseProduct {
    protected int id;
    protected String name; // use as external ID
    protected double specificHeatAfterFreezing_kJ_kgK;

    protected BaseProduct() {
    }

    protected BaseProduct(int id,
                          String name,
                          double specificHeatAfterFreezing_kJ_kgK) {
        this.id = id;
        this.name = name;
        this.specificHeatAfterFreezing_kJ_kgK = specificHeatAfterFreezing_kJ_kgK;
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

    public double getSpecificHeatAfterFreezing_kJ_kgK() {
        return specificHeatAfterFreezing_kJ_kgK;
    }

    public void setSpecificHeatAfterFreezing_kJ_kgK(double specificHeatAfterFreezing_kJ_kgK) {
        this.specificHeatAfterFreezing_kJ_kgK = specificHeatAfterFreezing_kJ_kgK;
    }
}
