package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        User alice = new User();
        alice.setAge(27);
        alice.setName("Alice");
        User bob = new User();
        bob.setName("Bob");
        bob.setAge(29);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(alice);
        userService.add(bob);
        userService.getAll().forEach(System.out::println);
    }
}
