package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User bob = new User();
        bob.setName("Bob");
        User alice = new User();
        alice.setName("Alice");
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.add(bob);
        userService.add(alice);
        userService.getAll().forEach(System.out::println);
    }
}
