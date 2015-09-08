package com.kostyazyu.cooler.model.room;

public class Insulation {
    private InsulationMaterial material;
    private double thickness_mm=0d;

    public Insulation() {
        material = new InsulationMaterial();
    }

    public Insulation(InsulationMaterial material, double thickness_mm) {
        this.material = material;
        this.thickness_mm = thickness_mm;
    }
}
