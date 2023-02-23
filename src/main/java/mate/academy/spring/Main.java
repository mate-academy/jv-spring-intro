package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setAge(20);
        user1.setName("Alice");

        User user2 = new User();
        user2.setName("Bob");
        user2.setAge(24);

        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService =
                annotationConfigApplicationContext.getBean(UserService.class);

        userService.add(user1);
        userService.add(user2);

        userService.getAll().forEach(System.out::println);

    }
}
