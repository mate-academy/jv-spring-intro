package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        User bob = new User();
        bob.setAge(20);
        bob.setName("Bob");

        User alice = new User();
        alice.setAge(30);
        alice.setName("Alice");

        User jack = new User();
        jack.setAge(35);
        jack.setName("Jack");

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(bob);
        userService.add(alice);
        userService.add(jack);
        userService.getAll().forEach(System.out::println);
    }
}
