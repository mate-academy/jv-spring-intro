package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User alice = new User("Alice", 22, true);

        User bob = new User("Bob", 45, false);

        UserService userService = context.getBean(UserService.class);
        userService.add(alice);
        userService.add(bob);
        System.out.println(userService.getAll());
    }
}
