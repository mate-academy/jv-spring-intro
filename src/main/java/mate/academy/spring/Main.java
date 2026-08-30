package mate.academy.spring;

import java.util.List;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        User bob = new User(22, "Bob");
        User vlad = new User(28, "Vlad");
        UserService userService = context.getBean(UserService.class);
        userService.add(bob);
        userService.add(vlad);
        List<User> allUsers = userService.getAll();
        allUsers.forEach(System.out::println);
    }
}
