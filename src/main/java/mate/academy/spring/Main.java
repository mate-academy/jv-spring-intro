package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean(UserService.class);
        final UserService userService = context.getBean(UserService.class);
        User bob = new User();
        bob.setName("Bob");
        User alice = new User();
        alice.setName("Alice");
        User john = new User();
        john.setName("John");
        userService.add(bob);
        userService.add(alice);
        userService.add(john);
        userService.getAll().forEach(System.out::println);
    }
}
