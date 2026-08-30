package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        User userBob = new User();
        userBob.setName("Bob");
        userBob.setAge(25);

        User userAlice = new User();
        userAlice.setName("Alice");
        userAlice.setAge(29);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(userBob);
        userService.add(userAlice);
        System.out.println(userService.getAll());

    }
}
