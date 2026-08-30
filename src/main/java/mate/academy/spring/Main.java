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
        userBob.setName("Bob");
        userBob.setAge(18);
        userService.add(userBob);
        User userAlice = new User();
        userBob.setName("Alice");
        userBob.setAge(40);
        userService.add(userAlice);
        userService.getAll().forEach(System.out::println);
    }
}
