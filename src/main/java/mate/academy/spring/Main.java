package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        User user1 = new User(44, "Ihor");
        User user2 = new User(41, "Andriy");
        userService.add(user1);
        userService.add(user2);
        userService.getAll().forEach(System.out::println);
    }
}
