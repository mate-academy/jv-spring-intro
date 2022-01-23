package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final ApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User bob = new User();
        bob.setName("Bob");
        bob.setEmail("bob@gmail.com");

        User alice = new User();
        alice.setName("Alice");
        alice.setEmail("alice@gmail.com");

        UserService userService = context.getBean(UserService.class);
        userService.add(bob);
        userService.add(alice);

        System.out.println(userService.getAll());
    }
}
