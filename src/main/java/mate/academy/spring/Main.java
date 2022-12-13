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
        User artemUser = new User(44,"Artem");
        User aliceUser = new User(35,"Alice");
        userService.add(artemUser);
        userService.add(aliceUser);
        List<User> users = userService.getAll();
        System.out.println(users);
    }
}
