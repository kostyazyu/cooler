package com.kostyazyu.cooler.dao.jpa;

import com.kostyazyu.cooler.dao.ProductDao;
import com.kostyazyu.cooler.model.product.Packing;
import com.kostyazyu.cooler.model.product.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Konstantin Zyubin
 * on 06.10.2015.
 * Moscow, Reutov
 */
@Repository
@Transactional(readOnly = true)
public class ProductDaoImpl implements ProductDao {


    @PersistenceContext
    EntityManager em;

    @Override
    @Transactional
    public Product save(Product product) {
        if (product.isNew()) {
            em.persist(product);
        } else {
            em.merge(product);
        }
        return product;
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(Product.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public Product get(int id) {
        return em.find(Product.class, id);
    }

    @Override
    public Product getByName(String name) {
        TypedQuery<Product> query = em.createNamedQuery(Product.BY_NAME, Product.class).setParameter("name", name);
        List<Product> resultList = query.getResultList();
        if (resultList.isEmpty()) {
            return null;
        } else {
            return resultList.get(0);
        }
    }

    @Override
    public List<Product> getAll() {
        return em.createNamedQuery(Product.ALL_SORTED, Product.class).getResultList();
    }
}
