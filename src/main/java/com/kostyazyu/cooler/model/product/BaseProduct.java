package com.kostyazyu.cooler.model.product;

public abstract class BaseProduct {
    protected int id;
    protected String name; // use as external ID
    protected double solidSpecificHeat_kJ_kgK;

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

    public double getSolidSpecificHeat_kJ_kgK() {
        return solidSpecificHeat_kJ_kgK;
    }

    public void setSolidSpecificHeat_kJ_kgK(double solidSpecificHeat_kJ_kgK) {
        this.solidSpecificHeat_kJ_kgK = solidSpecificHeat_kJ_kgK;
    }
}
