package com.kostyazyu.cooler.service;


import com.kostyazyu.cooler.model.product.Product;
import com.kostyazyu.cooler.util.NotFoundException;

import java.util.List;

public interface ProductService {

    Product save(Product product);

    boolean delete(int id) throws NotFoundException;

    Product get(int id) throws NotFoundException;

    Product getByName(String name) throws NotFoundException;

    List<Product> getAll();

    void update(Product product) throws NotFoundException;
}
