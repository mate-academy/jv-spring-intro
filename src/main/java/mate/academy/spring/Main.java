package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setLogin("test@test");
        user.setPassword("test123");
        User user1 = new User();
        user1.setLogin("test1@test1");
        user1.setPassword("test12345");
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(user);
        userService.add(user1);
        System.out.println(userService.getAll());
    }
}
