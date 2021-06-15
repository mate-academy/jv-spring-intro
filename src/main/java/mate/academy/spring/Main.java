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

        User alice = new User("Alice", "Bobson",18);
        User bob = new User("Bob", "Alicon", 22);

        userService.add(alice);
        userService.add(bob);

        userService.listUsers().forEach(System.out::println);
    }
}
