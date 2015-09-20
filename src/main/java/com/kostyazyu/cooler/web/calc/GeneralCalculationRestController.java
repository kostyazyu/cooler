package com.kostyazyu.cooler.web.calc;

import com.kostyazyu.cooler.LoggedUser;
import com.kostyazyu.cooler.LoggerWrapper;
import com.kostyazyu.cooler.model.GeneralCalculation;
import com.kostyazyu.cooler.service.GeneralCalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.List;

@Controller
public class GeneralCalculationRestController {
    private static final LoggerWrapper LOG = LoggerWrapper.get(GeneralCalculationRestController.class);

    @Autowired
    private GeneralCalcService calcService;

    public GeneralCalculation get(int id) {
        int userId = LoggedUser.id();
        LOG.info("get calculation {} for User {}", id, userId);
        return calcService.get(id, userId);
    }

    public void delete(int id) {
        int userId = LoggedUser.id();
        LOG.info("delete calculation {} for User {}", id, userId);
        calcService.delete(id, userId);
    }

    public List<GeneralCalculation> getAll() {
        int userId = LoggedUser.id();
        LOG.info("getAll for User {}", userId);
        return calcService.getAll(userId);
    }

    public void deleteAll() {
        int userId = LoggedUser.id();
        LOG.info("deleteAll for User {}", userId);
        calcService.deleteAll(userId);
    }

    public void update(GeneralCalculation calculation) {
        int userId = LoggedUser.id();
        LOG.info("update {} for User {}", calculation, userId);
        calcService.update(calculation, userId);
    }

    public GeneralCalculation create(GeneralCalculation calculation) {
        int userId = LoggedUser.id();
        LOG.info("create {} for User {}", calculation, userId);
        return calcService.save(calculation, userId);
    }

    public List<GeneralCalculation> getBetween(LocalDate start, LocalDate end) {
        int userId = LoggedUser.id();
        LOG.info("getBetween dates {} - {} for User {}", start, end, userId);
        return calcService.getBetween(start, end, userId);
    }
}