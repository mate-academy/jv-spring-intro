package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        UserService userService = context.getBean(UserService.class);
        User bob = new User();
        bob.setEmail("bob@mail");
        bob.setPassword("bobPass");
        userService.add(bob);
        User alice = new User();
        alice.setEmail("alice@mail");
        alice.setPassword("alicePass");
        userService.add(alice);
        userService.getAll().forEach(System.out::println);
    }
}
