package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static AnnotationConfigApplicationContext context = new
            AnnotationConfigApplicationContext(AppConfig.class);
    private static UserService userService = context.getBean(UserService.class);

    public static void main(String[] args) {
        User bob = new User();
        bob.setAge(20);
        bob.setName("Bob");
        userService.add(bob);
        User alice = new User();
        alice.setAge(30);
        alice.setName("Alice");
        userService.add(alice);
        userService.getAll().forEach(System.out::println);
    }
}
