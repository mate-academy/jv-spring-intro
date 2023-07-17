package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(AppConfig.class);
    private static final UserService userService = context.getBean(UserService.class);

    public static void main(String[] args) {
        User alice = new User();
        alice.setAge(20);
        alice.setName("Alice");
        userService.add(alice);

        User bob = new User();
        bob.setAge(9);
        bob.setName("Bob");
        userService.add(bob);

        userService.getAll().forEach(System.out::println);
    }
}
