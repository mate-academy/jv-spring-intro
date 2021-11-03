package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void runTest() {
        User alice = new User();
        alice.setName("Alice");
        User bob = new User();
        bob.setName("Bob");
        UserService userService = context.getBean(UserService.class);
        userService.add(alice);
        userService.add(bob);
        userService.getAll().forEach(System.out::println);
    }
}
