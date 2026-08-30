package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        User userBob = new User();
        userBob.setAge(20);
        userBob.setName("Bob");
        userService.add(userBob);
        User userAlice = new User();
        userAlice.setAge(24);
        userAlice.setName("Alice");
        userService.add(userAlice);

        System.out.println(userService.getAll());

    }
}
