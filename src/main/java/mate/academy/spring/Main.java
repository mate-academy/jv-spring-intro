package mate.academy.spring;

import java.util.List;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User(23, "Kate"),
                new User(19, "Jonah")
        );

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        users.forEach(user -> System.out.println(userService.add(user))
        );
        System.out.println(userService.getAll());
    }
}
