package com.kostyazyu.cooler.service;


import com.kostyazyu.cooler.model.product.Packing;
import com.kostyazyu.cooler.util.NotFoundException;

import java.util.List;

public interface PackingService {

    Packing save(Packing product);

    boolean delete(int id) throws NotFoundException;

    Packing get(int id) throws NotFoundException;

    Packing getByName(String name) throws NotFoundException;

    List<Packing> getAll();

    void update(Packing packing) throws NotFoundException;
}
