package com.kostyazyu.cooler.service;

import com.kostyazyu.cooler.model.room.InsulationMaterial;
import com.kostyazyu.cooler.util.NotFoundException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static com.kostyazyu.cooler.InsulationMaterialTestData.*;

/**
 * Created by Konstantin Zyubin
 * on 07.10.2015.
 * Moscow, Reutov
 */
@ContextConfiguration({
        "classpath:spring/spring-app.xml",
        "classpath:spring/spring-db.xml"
})
@RunWith(SpringJUnit4ClassRunner.class)
@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts ="classpath:db/populateDB.sql")
public class InsulationMaterialServiceImplTest {

    @Autowired
    InsulationMaterialService materialService;

    @Test
    public void testSave() throws Exception {
        InsulationMaterial created = getCreated();
        materialService.save(created);
        MATCHER.assertListEquals(Arrays.asList(created, FOAMEX, GLASS_WOOL, PLASTIC_FOAM), materialService.getAll());
    }

    @Test
    public void testDelete() throws Exception {
        materialService.delete(INSULATION_SEQUENCE);
        MATCHER.assertListEquals(Arrays.asList(FOAMEX, GLASS_WOOL), materialService.getAll());

    }

    @Test(expected = NotFoundException.class)
    public void testDeleteNotFound() throws Exception {
        materialService.delete(100);

    }

    @Test
    public void testGet() throws Exception {
        InsulationMaterial material = materialService.get(INSULATION_SEQUENCE);
        MATCHER.assertEquals(material, PLASTIC_FOAM);
    }

    @Test(expected = NotFoundException.class)
    public void testGetNotFound() throws Exception {
        materialService.get(100);
    }

    @Test
    public void testGetByName() throws Exception {
        InsulationMaterial foamex = materialService.getByName("Foamex");
        MATCHER.assertEquals(foamex, FOAMEX);
    }

    @Test(expected = NotFoundException.class)
    public void testGetByNameNotFound() throws Exception {
        materialService.getByName("Stone");
    }

    @Test
    public void testGetAll() throws Exception {
        List<InsulationMaterial> all = materialService.getAll();
        MATCHER.assertListEquals(all, INSULATIONS);
    }

    @Test
    public void testUpdate() throws Exception {
        InsulationMaterial updated = getUpdated();
        materialService.update(updated);
        MATCHER.assertListEquals(Arrays.asList(FOAMEX, GLASS_WOOL, updated), materialService.getAll());
    }
}