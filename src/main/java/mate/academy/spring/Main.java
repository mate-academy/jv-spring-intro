package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);
    private static final UserService userService = context.getBean(UserService.class);

    public static void main(String[] args) {
        User user = new User("Max", 21);
        userService.add(user);

        System.out.println(userService.getAll());
    }
}
