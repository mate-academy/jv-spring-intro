package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);
    public static final UserService userService = context.getBean(UserService.class);

    public static void main(String[] args) {
        User alice = new User();
        alice.setAge(18);
        alice.setName("Alice");
        User bob = new User();
        bob.setAge(43);
        bob.setName("Bob");
        User tomas = new User();
        tomas.setAge(3);
        tomas.setName("Tomas");
        userService.add(alice);
        userService.add(bob);
        userService.getAll().forEach(System.out::println);
        userService.add(tomas);
        userService.getAll().forEach(System.out::println);
    }
}
