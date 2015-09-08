package com.kostyazyu.cooler.model.product;

public class Packing extends BaseProduct {
    public Packing() {
    }

    public Packing(int id,
                   String name,
                   double specificHeatAfterFreezing_kJ_kgK) {
        super(id, name, specificHeatAfterFreezing_kJ_kgK);
    }
}
