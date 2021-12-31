package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext CONTEXT =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("Bob");
        User user2 = new User();
        user2.setName("Alice");

        UserService userService = CONTEXT.getBean(UserService.class);
        userService.add(user1);
        userService.add(user2);
        userService.getAll().forEach(System.out::println);
    }
}
