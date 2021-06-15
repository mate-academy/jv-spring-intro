package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User bob = new User();
        bob.setName("Bob");
        bob.setEmail("bobby777@gmail.com");

        User alice = new User();
        alice.setName("Alice");
        alice.setEmail("alice47@gmail.com");

        User john = new User();
        john.setName("John");
        john.setEmail("johnyBoy@gmail.com");

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(bob);
        userService.add(alice);
        userService.add(john);
        System.out.println(userService.listUsers());
    }
}
