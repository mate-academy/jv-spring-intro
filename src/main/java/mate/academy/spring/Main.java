package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        UserService userService = context.getBean(UserService.class);

        User vasya = new User("vasya@gmail.com");
        User petya = new User("petya@ukr.net");

        userService.add(vasya);
        userService.add(petya);

        System.out.println(userService.getAll());
    }
}
