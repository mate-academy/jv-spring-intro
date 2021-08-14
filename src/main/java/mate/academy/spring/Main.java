package mate.academy.spring;

import java.util.List;
import mate.academy.spring.config.ApplicationConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User bob = new User("Bob", 20);
        User alice = new User("Alice", 15);
        User marie = new User("Marie", 30);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(bob);
        userService.add(alice);
        userService.add(marie);
        List<User> users = userService.getAll();
        users.forEach(System.out::println);
    }
}
