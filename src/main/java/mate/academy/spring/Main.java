package mate.academy.spring;

import java.util.List;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final ApplicationContext context
            = new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        UserService userService = context.getBean(UserService.class);

        User aleksandr = new User("aleksandr");
        userService.add(aleksandr);
        User andrew = new User("andrew");
        userService.add(andrew);
        User danya = new User("danya");
        userService.add(danya);
        User eugene = new User("eugene");
        userService.add(eugene);
        User pasha = new User("pasha");
        userService.add(pasha);

        List<User> gachiSquad = userService.getAll();
        gachiSquad.forEach(System.out::println);
    }
}
