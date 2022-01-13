package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        UserService userService = context.getBean(UserService.class);
        User user1 = new User("user1", "qwer");
        User user2 = new User("user2", "1234");

        userService.add(user1);
        userService.add(user2);

        System.out.println(userService.getAll());
    }
}
