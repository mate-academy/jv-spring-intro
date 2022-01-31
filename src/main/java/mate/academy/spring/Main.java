package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User bob = new User();
        bob.setName("Edward");

        User alice = new User();
        alice.setName("Tony");

        UserService userService = context.getBean(UserService.class);

        userService.add(bob);
        userService.add(alice);

        userService.getAll().forEach(System.out::println);
    }
}
