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

        User bob = new User("Bob", 40);
        User alice = new User("Alice", 30);
        System.out.println(userService.add(bob));
        System.out.println(userService.add(alice));
        userService.getAll().forEach(System.out::println);
    }
}
