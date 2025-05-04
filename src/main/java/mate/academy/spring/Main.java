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

        User user = new User("Bob", 25);
        User user2 = new User("Alice", 27);
        User user3 = new User("John", 30);

        userService.add(user);
        userService.add(user2);
        userService.add(user3);

        System.out.println(userService.getAll());
    }
}
