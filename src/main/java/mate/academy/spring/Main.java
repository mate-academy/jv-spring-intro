package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        final UserService userService = context.getBean(UserService.class);

        User bob = new User();
        bob.setName("Bob");
        bob.setAge(14);

        User alice = new User();
        alice.setName("Alice");
        alice.setAge(15);

        userService.add(bob);
        userService.add(alice);
        userService.getAll().forEach(System.out::println);
    }
}
