package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setEmail("user1");
        user1.setPassword("qwerty");
        User user2 = new User();
        user2.setEmail("user2");
        user2.setPassword("qwerty");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(user1);
        userService.add(user2);
        System.out.println(userService.getAll());
    }
}
