package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);

        User userBob = new User();
        userBob.setName("Bob");
        userBob.setAge(327);

        User userJorge = new User();
        userJorge.setName("Jorge");
        userJorge.setAge(13);

        userService.add(userBob);
        userService.add(userJorge);

        List<User> allUsers = userService.getAll();


    }
}
