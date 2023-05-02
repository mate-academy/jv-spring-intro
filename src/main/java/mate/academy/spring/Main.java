package mate.academy.spring;

import java.util.List;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);
    private static final UserService userService =
            context.getBean(UserService.class);

    public static void main(String[] args) {
        User user = new User();
        user.setAge(38);
        user.setName("Sergiy");
        System.out.println(userService.add(user));
        List<User> allUsers = userService.getAll();
        allUsers.forEach(System.out::println);
    }
}
