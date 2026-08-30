package mate.academy.spring;

import java.util.List;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Nazar");
        user.setAge(20);

        User user1 = new User();
        user1.setName("Artem");
        user1.setAge(21);

        User user2 = new User();
        user2.setName("Bohdan");
        user2.setAge(19);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(user);
        userService.add(user1);
        userService.add(user2);

        List<User> users = userService.getAll();
        users.stream().forEach(System.out::println);
    }
}
