package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        final UserService userService = context.getBean(UserService.class);

        User dima = new User();
        dima.setName("Dima");
        dima.setAge(32);

        User bob = new User();
        bob.setName("Bob");
        bob.setAge(36);

        userService.add(dima);
        userService.add(bob);
        userService.getAll().forEach(System.out::println);
    }
}
