package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User bob = new User("bob", "bob@gmail.com");
        User alice = new User("alice", "alice@gmail.com");
        User max = new User("max", "max@gmail.com");

        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = annotationConfigApplicationContext.getBean(UserService.class);
        userService.add(bob);
        userService.add(alice);
        userService.add(max);

        userService.listUsers().forEach(System.out::println);
    }
}
