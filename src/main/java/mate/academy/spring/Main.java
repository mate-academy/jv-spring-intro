package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        User bob = new User();
        bob.setAge(23);
        bob.setName("Bob");
        User alice = new User();
        alice.setAge(22);
        alice.setName("Alice");
        UserService userService = context.getBean(UserService.class);
        System.out.println("Was added user: " + userService.add(bob));
        System.out.println("Was added user: " + userService.add(alice));
        userService.getAll().forEach(System.out::println);
    }
}
