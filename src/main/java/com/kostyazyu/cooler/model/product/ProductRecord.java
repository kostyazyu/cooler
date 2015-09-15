package com.kostyazyu.cooler.model.product;

public class ProductRecord {
    private Product product;
    private Packing packing;
    private int prodMass_kg;
    private int prodTurnover_kg;
    private int startTemperature_C;
    private int finalTemperature_C;
    private double packingMassFraction_df;

    private ProductRecord(Builder builder) {
        this.product = builder.product;
        this.packing = builder.packing;
        this.prodMass_kg = builder.prodMass_kg;
        this.prodTurnover_kg = builder.prodTurnover_kg;
        this.startTemperature_C = builder.startTemperature_C;
        this.finalTemperature_C = builder.finalTemperature_C;
        this.packingMassFraction_df = builder.packingMassFraction_df;
    }

    public static class Builder {
        private Product product;
        private Packing packing;
        private int prodMass_kg;
        private int prodTurnover_kg;
        private int startTemperature_C;
        private int finalTemperature_C;
        private double packingMassFraction_df;

        public Builder(Product product, Packing packing) {
            this.product = product;
            this.packing = packing;
        }

        public Builder prodMass_kg(int prodMass_kg) {
            this.prodMass_kg = prodMass_kg;
            return this;
        }
        public Builder prodTurnover_kg(int prodTurnover_kg) {
            this.prodTurnover_kg = prodTurnover_kg;
            return this;
        }
        public Builder startTemperature_C(int startTemperature_C) {
            this.startTemperature_C = startTemperature_C;
            return this;
        }
        public Builder finalTemperature_C(int finalTemperature_C) {
            this.finalTemperature_C = finalTemperature_C;
            return this;
        }
        public Builder packingMassFraction_df(double packingMassFraction_df) {
            this.packingMassFraction_df = packingMassFraction_df;
            return this;
        }

        public ProductRecord build() {
            return new ProductRecord(this);
        }
    }



}
