package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User dima = new User();
        dima.setName("Dima");
        dima.setAge(23);
        User vlad = new User();
        vlad.setName("Vlad");
        vlad.setAge(16);
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(dima);
        userService.add(vlad);
        System.out.println(userService.getAll());
    }
}
