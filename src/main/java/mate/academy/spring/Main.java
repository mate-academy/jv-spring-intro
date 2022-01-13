package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User adam = new User("firstEmail@gmail.com", "1234567");
        User eve = new User("ribEmail@gmail.com", "7654321");

        UserService userService = context.getBean(UserService.class);
        userService.add(adam);
        userService.add(eve);
        userService.getAll().forEach(System.out::println);
    }
}
