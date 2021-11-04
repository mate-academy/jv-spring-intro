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
        User user1 = new User();
        user1.setEmail("user1@test.com");
        user1.setPassword("user1");
        User user2 = new User();
        user2.setEmail("user2@test.com");
        user2.setPassword("user2");
        UserService userService = context.getBean(UserService.class);
        userService.add(user1);
        userService.add(user2);
        List<User> allUsersFromDb = userService.getAll();
        System.out.println(allUsersFromDb);
    }
}
