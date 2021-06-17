package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        UserService userService = context.getBean(UserService.class);
        User bobo = new User("Bobo", "bobogmail", "paswordsecure");
        User aliso = new User("Aliso", "alisogmail", "notsecurepassword");
        userService.add(bobo);
        userService.add(aliso);
        System.out.println(userService.listUsers());
    }
}
