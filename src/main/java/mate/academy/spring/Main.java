package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
private static final AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        UserService userService = context.getBean(UserService.class);
        User user = new User();
        user.setEmail("test@ukr.net");
        user.setPassword("test");
        userService.add(user);
        userService.getAll().forEach(System.out::println);
    }
}
