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
        User denys = new User();
        denys.setAge(21);
        denys.setName("Denys");
        userService.add(denys);
        User antony = new User();
        antony.setAge(30);
        antony.setName("Antony");
        userService.add(antony);

        List<User> users = userService.getAll();
        users.forEach(System.out::println);
    }
}
