package com.kostyazyu.cooler.model.product;

public class PackingData extends BaseProductData {
    protected Packing packing;

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

}
