package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext contex =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = contex.getBean(UserService.class);
        userService.add(new User("Bob", "1234"));
        userService.add(new User("Alice", "4321"));
        userService.getAll().forEach(System.out::println);
    }
}
