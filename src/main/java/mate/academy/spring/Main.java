package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        User userBob = new User();
        userBob.setName("Bob");
        userBob.setAge(327);

        User userJorge = new User();
        userJorge.setName("Jorge");
        userJorge.setAge(13);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(userBob);
        userService.add(userJorge);
    }
}
