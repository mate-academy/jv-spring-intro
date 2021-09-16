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
        User bob = new User("Bob", "Jackson", "bob@gmail.com");
        userService.add(bob);

        User alice = new User("Alice", "Horton", "alice@gmail.com");
        userService.add(alice);

        User userFromDb = userService.get(1L);
        System.out.println("userFromDb: " + userFromDb);
        userService.getAll().forEach(System.out::println);
    }
}
