package com.kostyazyu.cooler.service;

import com.kostyazyu.cooler.model.product.Packing;
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

import static com.kostyazyu.cooler.PackingTestData.*;
import static org.junit.Assert.*;

@ContextConfiguration({
        "classpath:spring/spring-app.xml",
        "classpath:spring/spring-db.xml"
})
@RunWith(SpringJUnit4ClassRunner.class)
@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts ="classpath:db/populateDB.sql")
public class PackingServiceImplTest {

    @Autowired
    PackingServiceImpl packingService;

    @Test
    public void testSave() throws Exception {
        Packing created = getCreated();
        packingService.save(created);
        MATCHER.assertListEquals(Arrays.asList(created, MINWOOL, PERLIT, PPU), packingService.getAll());
    }

    @Test
    public void testDelete() throws Exception {
        packingService.delete(PACKING_SEQUENCE);
        MATCHER.assertListEquals(Arrays.asList(MINWOOL, PERLIT), packingService.getAll() );
    }

    @Test(expected = NotFoundException.class)
    public void testDeleteNotFound() throws Exception {
        packingService.delete(100_000);
    }

    @Test
    public void testGet() throws Exception {
        Packing packing = packingService.get(PACKING_SEQUENCE);
        MATCHER.assertEquals(packing, PPU);
    }
    @Test(expected = NotFoundException.class)
    public void testGetNotFound() throws Exception {
        packingService.get(PACKING_SEQUENCE + 100);
    }

    @Test
    public void testGetByName() throws Exception {
        Packing ppu = packingService.getByName("PPU");
        MATCHER.assertEquals(ppu, PPU);
    }
    @Test(expected = NotFoundException.class)
    public void testGetByNameNotFound() throws Exception {
        packingService.getByName("Suzanna");
    }

    @Test
    public void testGetAll() throws Exception {
        List<Packing> packings = packingService.getAll();
        MATCHER.assertListEquals(packings, PACKINGS);
    }

    @Test
    public void testUpdate() throws Exception {
        Packing updated = getUpdated();
        packingService.update(updated);
        MATCHER.assertListEquals(Arrays.asList(MINWOOL, PERLIT, updated), packingService.getAll());
    }
}