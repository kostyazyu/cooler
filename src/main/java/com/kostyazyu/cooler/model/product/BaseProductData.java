package com.kostyazyu.cooler.model.product;

public abstract class BaseProductData {
    protected int mass_kg;
    protected int turnover_kg;
    protected int arrivalTemperature_C;
    protected int finalTemperature_C;

    protected BaseProductData() {
    }

    protected BaseProductData(int mass_kg,
                           int turnover_kg,
                           int arrivalTemperature_C,
                           int finalTemperature_C) {
        this.mass_kg = mass_kg;
        this.turnover_kg = turnover_kg;
        this.arrivalTemperature_C = arrivalTemperature_C;
        this.finalTemperature_C = finalTemperature_C;
    }

    public int getMass_kg() {
        return mass_kg;
    }

    public void setMass_kg(int mass_kg) {
        this.mass_kg = mass_kg;
    }

    public int getTurnover_kg() {
        return turnover_kg;
    }

    public void setTurnover_kg(int turnover_kg) {
        this.turnover_kg = turnover_kg;
    }

    public int getArrivalTemperature_C() {
        return arrivalTemperature_C;
    }

    public void setArrivalTemperature_C(int arrivalTemperature_C) {
        this.arrivalTemperature_C = arrivalTemperature_C;
    }

    public int getFinalTemperature_C() {
        return finalTemperature_C;
    }

    public void setFinalTemperature_C(int finalTemperature_C) {
        this.finalTemperature_C = finalTemperature_C;
    }
}
