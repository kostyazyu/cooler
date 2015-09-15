package com.kostyazyu.cooler.model.product;

public class Product extends BaseProduct {
    private double freezingPoint_C;
    private double liquidSpecificHeat_kJ_kgK;
    private double latentHeatOfMelting_kJ_kg;
    private double respiratoryHeat_kJ_tonKg_10;
    private double respiratoryHeat_kJ_tonKg_20;
    private double respiratoryHeat_kJ_tonKg_30;

    public double getFreezingPoint_C() {
        return freezingPoint_C;
    }

    public void setFreezingPoint_C(double freezingPoint_C) {
        this.freezingPoint_C = freezingPoint_C;
    }

    public double getLiquidSpecificHeat_kJ_kgK() {
        return liquidSpecificHeat_kJ_kgK;
    }

    public void setLiquidSpecificHeat_kJ_kgK(double liquidSpecificHeat_kJ_kgK) {
        this.liquidSpecificHeat_kJ_kgK = liquidSpecificHeat_kJ_kgK;
    }

    public double getLatentHeatOfMelting_kJ_kg() {
        return latentHeatOfMelting_kJ_kg;
    }

    public void setLatentHeatOfMelting_kJ_kg(double latentHeatOfMelting_kJ_kg) {
        this.latentHeatOfMelting_kJ_kg = latentHeatOfMelting_kJ_kg;
    }

    public double getRespiratoryHeat_kJ_tonKg_10() {
        return respiratoryHeat_kJ_tonKg_10;
    }

    public void setRespiratoryHeat_kJ_tonKg_10(double respiratoryHeat_kJ_tonKg_10) {
        this.respiratoryHeat_kJ_tonKg_10 = respiratoryHeat_kJ_tonKg_10;
    }

    public double getRespiratoryHeat_kJ_tonKg_20() {
        return respiratoryHeat_kJ_tonKg_20;
    }

    public void setRespiratoryHeat_kJ_tonKg_20(double respiratoryHeat_kJ_tonKg_20) {
        this.respiratoryHeat_kJ_tonKg_20 = respiratoryHeat_kJ_tonKg_20;
    }

    public double getRespiratoryHeat_kJ_tonKg_30() {
        return respiratoryHeat_kJ_tonKg_30;
    }

    public void setRespiratoryHeat_kJ_tonKg_30(double respiratoryHeat_kJ_tonKg_30) {
        this.respiratoryHeat_kJ_tonKg_30 = respiratoryHeat_kJ_tonKg_30;
    }
}
