package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(AppConfig.class);
    public static void main(String[] args) {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.add(new User("username", "awesome password"));
        userService.add(new User("Carl", "with awesome password"));
        System.out.println(userService.getAll());
    }
}
