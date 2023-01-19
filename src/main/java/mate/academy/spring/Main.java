package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        List<User> users = new ArrayList<>();
        users.add(new User("Bob", 30));
        users.add(new User("Alice", 25));
        users.add(new User("John", 20));
        users.forEach(userService::add);
        System.out.println(userService.getAll());
    }
}
