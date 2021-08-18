package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        UserService userService = context.getBean(UserService.class);
        User userBob = new User("Bob", "1111");
        User userAlice = new User("Alice", "2222");
        userService.add(userBob);
        userService.add(userAlice);
        userService.getAll().forEach(System.out::println);
    }
}
