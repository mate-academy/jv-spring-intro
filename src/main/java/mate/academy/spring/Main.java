package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User userBob = new User("bobtest@test.com", "123");
        User userAlice = new User("alicetest@test.ua", "321");
        User userJohn = new User("johntest@test.net", "345");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);
        userService.add(userAlice);
        userService.add(userBob);
        userService.add(userJohn);
        userService.listUsers().forEach(System.out::println);
    }
}
