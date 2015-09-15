package com.kostyazyu.cooler.dao;

import com.kostyazyu.cooler.model.product.Product;

import java.util.List;

public interface ProductDao {

    Product save(Product product);

    //false if not found
    boolean delete(int id);

    //null if not found
    Product get(int id);

    //null if not found
    Product getByName(String name);

    //empty list if not found
    List<Product> getAll();

}
