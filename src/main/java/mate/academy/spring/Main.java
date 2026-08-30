package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        UserService userService = context.getBean(UserService.class);

        User alice = new User();
        alice.setAge(21);
        alice.setName("alice");
        userService.add(alice);

        User bob = new User();
        bob.setAge(21);
        bob.setName("bob");
        userService.add(bob);

        userService.getAll().forEach(System.out::println);
    }
}
