package mate.academy.spring;

import java.util.List;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        User user0 = new User();
        user0.setAge(12);
        user0.setName("Ivan");
        userService.add(user0);

        User user1 = new User();
        user1.setAge(18);
        user1.setName("Katya");
        userService.add(user1);

        List<User> users = userService.getAll();
        System.out.println(users.toString());
    }
}
