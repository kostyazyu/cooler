package com.kostyazyu.cooler.model.product;

/**
 * Created by Konstantin on 06.09.2015
 */
public class ProductData extends BaseProductData {
    protected Product product;

    public ProductData() {
    }

    public ProductData(int mass_kg,
                       int turnover_kg,
                       int arrivalTemperature_C,
                       int finalTemperature_C,
                       Product product) {
        super(mass_kg, turnover_kg, arrivalTemperature_C, finalTemperature_C);
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
