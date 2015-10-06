package com.kostyazyu.cooler.service.impl;

import com.kostyazyu.cooler.dao.ProductDao;
import com.kostyazyu.cooler.dao.jpa.ProductDaoImpl;
import com.kostyazyu.cooler.model.product.Product;
import com.kostyazyu.cooler.service.ProductService;
import com.kostyazyu.cooler.util.NotFoundException;
import com.kostyazyu.cooler.util.exception.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    public Product save(Product product) {
        return productDao.save(product);
    }

    @Override
    public void delete(int id) throws NotFoundException {
        ExceptionUtil.check(productDao.delete(id), id);
    }

    @Override
    public Product get(int id) throws NotFoundException {
        return ExceptionUtil.check(productDao.get(id), id);
    }

    @Override
    public Product getByName(String name) throws NotFoundException {
        return ExceptionUtil.check(productDao.getByName(name), "name=" + name);
    }

    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }

    @Override
    public void update(Product product) throws NotFoundException {
        ExceptionUtil.check(productDao.save(product), product.getId());
    }
}
