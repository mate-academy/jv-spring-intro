package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User userAlice = new User();
        userAlice.setAge(25);
        userAlice.setName("Alice");

        User userBob = new User();
        userBob.setAge(35);
        userBob.setName("Bob");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(userAlice);
        userService.add(userBob);

        System.out.println(userService.getAll());
    }
}
