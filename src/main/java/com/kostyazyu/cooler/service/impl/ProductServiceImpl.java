package com.kostyazyu.cooler.service.impl;

import com.kostyazyu.cooler.model.product.Product;
import com.kostyazyu.cooler.service.ProductService;
import com.kostyazyu.cooler.util.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    //TODO realization after implementation of JPA DAOs

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public boolean delete(int id) throws NotFoundException {
        return false;
    }

    @Override
    public Product get(int id) throws NotFoundException {
        return null;
    }

    @Override
    public Product getByName(String name) throws NotFoundException {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public void update(Product product) throws NotFoundException {

    }
}
