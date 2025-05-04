package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);
    private static final UserService userService =
            context.getBean(UserService.class);

    public static void main(String[] args) {
        User user = new User();
        user.setAge(18);
        user.setName("Bob");

        User user1 = new User();
        user1.setAge(20);
        user1.setName("Alice");

        userService.add(user);
        userService.add(user1);
        System.out.println(userService.getAll());
    }
}

