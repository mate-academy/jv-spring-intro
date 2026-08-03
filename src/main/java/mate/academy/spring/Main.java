package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(25);
        user.setName("Alice");
        User user2 = new User();
        user2.setAge(15);
        user2.setName("Bob");
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(user);
        userService.add(user2);
        userService.getAll().forEach(System.out::println);
    }
}
