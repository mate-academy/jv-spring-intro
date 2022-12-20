package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        User bob = new User(18, "Bob");
        User alice = new User(20, "Alice");
        System.out.printf("User %s was added to DB!", userService.add(bob));
        System.out.printf("User %s was added to DB!\n", userService.add(alice));
        System.out.println("All users: ");
        userService.getAll().forEach(System.out::println);
    }
}
