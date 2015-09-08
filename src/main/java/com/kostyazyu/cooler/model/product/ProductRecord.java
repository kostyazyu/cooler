package com.kostyazyu.cooler.model.product;

public class ProductRecord {
    private ProductData productData;
    private PackingData packingData;

    public ProductRecord() {
    }

    public ProductRecord(ProductData productData, PackingData packingData) {
        this.productData = productData;
        this.packingData = packingData;
    }

    public ProductData getProductData() {
        return productData;
    }

    public void setProductData(ProductData productData) {
        this.productData = productData;
    }

    public PackingData getPackingData() {
        return packingData;
    }

    public void setPackingData(PackingData packingData) {
        this.packingData = packingData;
    }
}
