package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        User bob = new User("Bob", "bob@gmail.com", "1234");
        User alice = new User("Alice", "alice@gmail.com", "0000");

        UserService userService = context.getBean(UserService.class);

        userService.add(bob);
        userService.add(alice);

        userService.getAll().forEach(System.out::println);
    }
}
