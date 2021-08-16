package mate.academy.spring;

import java.util.Random;
import mate.academy.spring.configuration.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User user = new User();
        user.setName("Ben");
        user.setAge(19);

        User user1 = new User();
        user1.setName("Not Ben");
        user1.setAge(new Random().nextInt(100));

        UserService userService = applicationContext.getBean(UserService.class);
        userService.add(user);
        userService.add(user1);

        userService.getAll().forEach(System.out::println);
    }
}
