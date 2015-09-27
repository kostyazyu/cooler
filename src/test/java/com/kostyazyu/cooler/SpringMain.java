package com.kostyazyu.cooler;

import com.kostyazyu.cooler.model.GeneralCalculation;
import com.kostyazyu.cooler.model.user.Role;
import com.kostyazyu.cooler.model.user.User;
import com.kostyazyu.cooler.web.user.AdminUserRestController;
import com.kostyazyu.cooler.web.calc.GeneralCalculationRestController;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;


public class SpringMain {
    public static void main(String[] args) {
        // java 7 Automatic resource management
        try (ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml", "classpath:spring/spring-mock.xml")) {
            System.out.println(Arrays.toString(appCtx.getBeanDefinitionNames()));
            AdminUserRestController adminUserController = appCtx.getBean(AdminUserRestController.class);
            System.out.println(adminUserController.create(new User(1, "user","lastName", "email", "password", Role.ROLE_ADMIN)));
            System.out.println();
            GeneralCalculationRestController mealController = appCtx.getBean(GeneralCalculationRestController.class);
            List<GeneralCalculation> calculations = mealController.getBetween(LocalDate.of(1986, Month.JULY, 28), LocalDate.now());
            calculations.forEach(System.out::println);
        }
    }
}
