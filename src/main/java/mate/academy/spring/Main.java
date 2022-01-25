package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        UserService userService = context.getBean(UserService.class);
        userService.add(new User("Bob", "first@ukr.net", "qwerty"));
        userService.add(new User("Alice", "second@ukr.net", "12345"));
        userService.getAll().forEach(System.out::println);
    }
}
