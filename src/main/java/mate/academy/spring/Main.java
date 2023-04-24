package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);
    private static final UserService userService = context.getBean(UserService.class);
    private static final int AGE = 18;
    private static final String BOBO = "bobo";
    private static final String ALICES = "alices";

    public static void main(String[] args) {

        User bobo = new User();
        bobo.setAge(AGE);
        bobo.setName(BOBO);

        User alices = new User();
        alices.setName(ALICES);
        alices.setAge(AGE);

        userService.add(bobo);
        userService.add(alices);
        System.out.println(userService.getAll());
    }
}
