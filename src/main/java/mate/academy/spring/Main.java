package mate.academy.spring;

import java.util.List;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User bob = new User("Bob");
        User alice = new User("Alice");
        UserService userService = context.getBean(UserService.class);
        userService.add(bob);
        userService.add(alice);
        List<User> userList = userService.getAll();
        userList.forEach(System.out::println);
    }
}
