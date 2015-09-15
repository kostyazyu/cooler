package com.kostyazyu.cooler.dao;

import com.kostyazyu.cooler.model.product.Packing;

import java.util.List;

public interface PackingDao {

    Packing save(Packing product);

    //false if not found
    boolean delete(int id);

    //null if not found
    Packing get(int id);

    //null if not found
    Packing getByName(String name);

    //empty list if not found
    List<Packing> getAll();

}
