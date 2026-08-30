package mate.academy.spring;

import java.util.List;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        User user1 = new User();
        user1.setAge(99);
        user1.setName("Mykola");
        User userFromDb = userService.add(user1);
        User user2 = new User();
        user2.setName("Iryna");
        user2.setAge(50);
        userService.add(user2);
        List<User> users = userService.getAll();
        users.forEach(System.out::println);

    }
}
