package com.kostyazyu.cooler.model.product;

import com.kostyazyu.cooler.model.BaseEntity;

public abstract class BaseProduct extends BaseEntity {

    protected String name;
    protected double solidSpecificHeat_kJ_kgK;

    public BaseProduct() {
    }

    public BaseProduct(int id, String name, double solidSpecificHeat_kJ_kgK) {
        super(id);
        this.name = name;
        this.solidSpecificHeat_kJ_kgK = solidSpecificHeat_kJ_kgK;
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
