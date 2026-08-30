package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext CONTEXT =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        UserService userService = CONTEXT.getBean(UserService.class);
        userService.add(new User("Bob", 18));
        userService.add(new User("Alice", 20));
        System.out.println(userService.getAll());
    }
}
