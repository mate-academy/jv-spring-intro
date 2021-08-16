package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User user1 = new User("Eugene", "Sinitsa");
        User user2 = new User("Sinitsa", "Eugene");

        UserService userService = context.getBean(UserService.class);

        userService.add(user1);
        userService.add(user2);

        userService.getAll().forEach(System.out::println);
    }
}
