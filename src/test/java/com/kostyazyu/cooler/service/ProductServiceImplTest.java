package com.kostyazyu.cooler.service;

import com.kostyazyu.cooler.model.product.Product;
import com.kostyazyu.cooler.service.impl.PackingServiceImpl;
import com.kostyazyu.cooler.util.NotFoundException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static com.kostyazyu.cooler.ProductTestData.*;

/**
 * Created by Konstantin Zyubin
 * on 06.10.2015.
 * Moscow, Reutov
 */


@ContextConfiguration({
        "classpath:spring/spring-app.xml",
        "classpath:spring/spring-db.xml"
})
@RunWith(SpringJUnit4ClassRunner.class)
@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts ="classpath:db/populateDB.sql")
public class ProductServiceImplTest {

    @Autowired
    ProductService productService;

    @Test
    public void testSave() throws Exception {
        Product created = getCreated();
        productService.save(created);
        MATCHER.assertListEquals(Arrays.asList(BEEF, created, PEPPER, SALMON), productService.getAll());
    }

    @Test
    public void testDelete() throws Exception {
        productService.delete(PRODUCT_SEQUENCE);
        MATCHER.assertListEquals(Arrays.asList(PEPPER, SALMON), productService.getAll());

    }
    @Test(expected = NotFoundException.class)
    public void testDeleteNotFound() throws Exception {
        productService.delete(1);
    }

    @Test
    public void testGet() throws Exception {
        Product product = productService.get(PRODUCT_SEQUENCE);
        MATCHER.assertEquals(product, BEEF);
    }

    @Test(expected = NotFoundException.class)
    public void testGetNotFound() throws Exception {
        productService.get(100);
    }

    @Test
    public void testGetByName() throws Exception {
        Product beef = productService.getByName("Beef");
        MATCHER.assertEquals(beef, BEEF);
    }
    @Test(expected = NotFoundException.class)
    public void testGetByNameNotFound() throws Exception {
        productService.getByName("Jenya");
    }

    @Test
    public void testGetAll() throws Exception {
        List<Product> all = productService.getAll();
        MATCHER.assertListEquals(all, Arrays.asList(BEEF, PEPPER, SALMON));
    }

    @Test
    public void testUpdate() throws Exception {
        Product updated = getUpdated();
        productService.save(updated);
        MATCHER.assertListEquals(Arrays.asList(updated, PEPPER, SALMON), productService.getAll());
    }
}