package com.kostyazyu.cooler.model.product;

import com.kostyazyu.cooler.model.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product_records")
public class ProductRecord extends BaseEntity {

    @OneToOne()
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToOne()
    @JoinColumn(name = "packing_id")
    private Packing packing;

    @NotNull
    @Column(name = "prodMassKG")
    private Integer prodMassKG;

    @NotNull
    @Column(name = "prodTurnoverKG")
    private Integer prodTurnoverKG;

    @NotNull
    @Column(name = "startTemperatureC")
    private Double startTemperatureC;

    @NotNull
    @Column(name = "finalTemperatureC")
    private Double finalTemperatureC;

    @NotNull
    @Column(name = "packingMassFractionDF")
    private Double packingMassFractionDF;

    public ProductRecord() {}

    private ProductRecord(Builder builder) {
        this.product = builder.product;
        this.packing = builder.packing;
        this.prodMassKG = builder.prodMassKG;
        this.prodTurnoverKG = builder.prodTurnoverKG;
        this.startTemperatureC = builder.startTemperatureC;
        this.finalTemperatureC = builder.finalTemperatureC;
        this.packingMassFractionDF = builder.packingMassFractionDF;
    }

    public static class Builder {
        private Product product;
        private Packing packing;
        private Integer prodMassKG;
        private Integer prodTurnoverKG;
        private Double startTemperatureC;
        private Double finalTemperatureC;
        private Double packingMassFractionDF;

        public Builder(Product product, Packing packing) {
            this.product = product;
            this.packing = packing;
        }

        public Builder prodMassKG(Integer prodMassKG) {
            this.prodMassKG = prodMassKG;
            return this;
        }

        public Builder prodTurnoverKG(Integer prodTurnoverKG) {
            this.prodTurnoverKG = prodTurnoverKG;
            return this;
        }

        public Builder startTemperatureC(Double startTemperatureC) {
            this.startTemperatureC = startTemperatureC;
            return this;
        }

        public Builder finalTemperatureC(Double finalTemperatureC) {
            this.finalTemperatureC = finalTemperatureC;
            return this;
        }

        public Builder packingMassFractionDF(Double packingMassFractionDF) {
            this.packingMassFractionDF = packingMassFractionDF;
            return this;
        }

        public ProductRecord build() {
            return new ProductRecord(this);
        }
    }
}
