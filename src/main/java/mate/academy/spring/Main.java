package mate.academy.spring;

import java.util.List;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.setAge(25);
        user.setName("Bob");
        User user1 = new User();
        user1.setAge(45);
        user1.setName("Alice");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(user);
        userService.add(user1);

        List<User> users = userService.getAll();
        for (User userFromList: users) {
            System.out.println(userFromList);
        }
    }
}
