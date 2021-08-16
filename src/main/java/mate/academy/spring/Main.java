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
        User ben = new User();
        ben.setName("Ben");
        ben.setAge(19);

        User notBen = new User();
        notBen.setName("Not Ben");
        notBen.setAge(new Random().nextInt(100));

        UserService userService = applicationContext.getBean(UserService.class);
        userService.add(ben);
        userService.add(notBen);

        userService.getAll().forEach(System.out::println);
    }
}
