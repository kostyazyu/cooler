package com.kostyazyu.cooler;

/**
 * Created by Konstantin Zyubin
 * on 06.10.2015.
 * Moscow, Reutov
 */
import com.kostyazyu.cooler.matcher.ModelMatcher;
import com.kostyazyu.cooler.model.product.Packing;
import com.kostyazyu.cooler.model.product.Product;

import java.util.Arrays;
import java.util.List;

import static com.kostyazyu.cooler.model.BaseEntity.START_SEQ;

public class ProductTestData {

    public static final Integer PRODUCT_SEQUENCE = START_SEQ + 9;

    public static final Product BEEF = new Product(PRODUCT_SEQUENCE, "Beef",  1500, -2, 2000, 300, 0, 0, 0);
    public static final Product PEPPER = new Product(PRODUCT_SEQUENCE + 1,"Pepper", 2300,  -1, 2000, 200, 10, 8, 6);
    public static final Product SALMON = new Product(PRODUCT_SEQUENCE + 2, "Salmon",  2500, -4, 2100, 230, 0, 0, 0);

    public static final List<Product> PRODUCTS = Arrays.asList(BEEF, PEPPER, SALMON);

    public static Product getCreated() {
        return new Product(null, "Cherry", 1000,  0, 900, 150, 14, 13, 12);
    }

    public static Product getUpdated() {
        return new Product(PRODUCT_SEQUENCE, "Beef Updated", -1.5, 1500, 2000, 300, 0, 0, 0);
    }

    public static final ModelMatcher<Product, String> MATCHER = new ModelMatcher<>(Product::toString);
}
