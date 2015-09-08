package com.kostyazyu.cooler.model.product;

public class PackingData extends BaseProductData {
    private Packing packing;

    public PackingData() {
    }

    public PackingData(int mass_kg,
                       int turnover_kg,
                       int arrivalTemperature_C,
                       int finalTemperature_C,
                       Packing packing) {
        super(mass_kg, turnover_kg, arrivalTemperature_C, finalTemperature_C);
        this.packing = packing;
    }

    public Packing getPacking() {
        return packing;
    }

    public void setPacking(Packing packing) {
        this.packing = packing;
    }
}
