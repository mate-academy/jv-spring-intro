package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User userAlice = new User();
        userAlice.setAge(19);
        userAlice.setName("Alice");

        User userBob = new User();
        userBob.setName("Bob");
        userBob.setAge(20);

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(userAlice);
        userService.add(userBob);
        System.out.println(userService.getAll());
    }
}
