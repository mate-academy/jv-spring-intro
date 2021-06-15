package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User alice = new User();
        alice.setLogin("alice");
        alice.setPassword("1234");

        User bob = new User();
        bob.setLogin("bob");
        bob.setPassword("4321");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(alice);
        userService.add(bob);

        userService.listUsers().forEach(System.out::println);
    }
}
