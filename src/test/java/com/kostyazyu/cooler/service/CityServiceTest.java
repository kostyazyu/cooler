package com.kostyazyu.cooler.service;

import com.kostyazyu.cooler.model.other.City;
import com.kostyazyu.cooler.util.NotFoundException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.NoResultException;
import java.util.Arrays;
import java.util.List;

import static com.kostyazyu.cooler.CityTestData .*;

@ContextConfiguration({
        "classpath:spring/spring-app.xml",
        "classpath:spring/spring-db.xml"
})
@RunWith(SpringJUnit4ClassRunner.class)
@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts ="classpath:db/populateDB.sql")
public class CityServiceTest {

    @Autowired
    private CityService cityService;

    @Test
    public void testSave() throws Exception {
        City created = getCreated();
        cityService.save(created);
        MATCHER.assertListEquals(Arrays.asList(created, BERLIN, HONG_KONG, MOSCOW, OSLO), cityService.getAll());
    }

    @Test
    public void testDelete() throws Exception {
        cityService.delete(CITY_SEQUENCE + 1);
        MATCHER.assertListEquals(Arrays.asList(BERLIN, MOSCOW, OSLO), cityService.getAll());
    }

    @Test(expected = NotFoundException.class)
    public void testDeleteNotFound() throws Exception {
        cityService.delete(CITY_SEQUENCE + 100);
    }

    @Test
    public void testGet() throws Exception {
        City actual = cityService.get(CITY_SEQUENCE);
        MATCHER.assertEquals(MOSCOW, actual);
    }


    @Test(expected = NotFoundException.class)
    public void testGetNotFound() throws Exception {
        cityService.get(CITY_SEQUENCE + 100);
    }

    @Test
    public void testGetByName() throws Exception {
        City actual = cityService.getByName(MOSCOW.getName());
        MATCHER.assertEquals(MOSCOW, actual);
    }

    @Test(expected = NoResultException.class)
    public void testGetByNameNotFound() throws Exception {
        cityService.getByName("Manturovo");
    }

    @Test
    public void testGetAll() throws Exception {
        List<City> allActual = cityService.getAll();
        MATCHER.assertListEquals(CITIES, allActual);
    }

    @Test
    public void testUpdate() throws Exception {
        City moscowUpdated = getUpdated();
        cityService.update(moscowUpdated);
        MATCHER.assertListEquals(Arrays.asList(BERLIN, HONG_KONG, moscowUpdated, OSLO), cityService.getAll());
    }
}