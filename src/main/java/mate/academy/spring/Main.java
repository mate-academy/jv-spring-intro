package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        User bob = new User();
        bob.setAge(21);
        bob.setName("Bob");
        User alice = new User();
        alice.setName("Alice");
        alice.setAge(21);

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        userService.add(bob);
        userService.add(alice);

        System.out.println(userService.getAll());

    }
}
