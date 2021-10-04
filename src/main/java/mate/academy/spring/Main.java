package mate.academy.spring;

import mate.academy.spring.config.AppConfiguration;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfiguration.class);

    public static void main(String[] args) {
        User bob = new User();
        bob.setName("bob");
        bob.setAge(20);

        User alice = new User();
        alice.setName("alice");
        alice.setAge(30);

        UserService userService = context.getBean(UserService.class);

        userService.add(bob);
        userService.add(alice);
        System.out.println(userService.getAll());
    }
}
