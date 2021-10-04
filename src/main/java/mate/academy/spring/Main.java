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
        User bob = new User();
        bob.setEmail("bob@gmail.com");
        bob.setPassword("mf34o3w");
        User alice = new User();
        alice.setEmail("alice@gmail.com");
        alice.setPassword("43r43f");
        UserService userService = context.getBean(UserService.class);
        userService.add(bob);
        userService.add(alice);
        List<User> allUsersFromDb = userService.getAll();
        allUsersFromDb.forEach(System.out::println);
    }
}
