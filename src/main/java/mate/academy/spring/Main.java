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
        User vova = new User(22, "Vova");
        User rafal = new User(27, "Rafal");

        UserService userService = context.getBean(UserService.class);
        userService.add(vova);
        userService.add(rafal);

        List<User> allUsers = userService.getAll();
        allUsers.forEach(System.out::println);
    }
}
