package mate.academy.spring;

import java.util.List;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User admin = new User("root@gmail.com", "root");

        UserService userService = context.getBean(UserService.class);
        userService.add(admin);

        List<User> userList = userService.getAll();
        userList.stream().forEach(System.out::println);
    }
}
