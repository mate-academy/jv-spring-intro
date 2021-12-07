package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext configApplicationContext =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User bob = new User("Bob", 21);
        User alice = new User("Alice", 19);
        User max = new User("Max", 22);
        User nika = new User("Nika", 20);

        UserService userService = configApplicationContext.getBean(UserService.class);
        userService.add(bob);
        userService.add(alice);
        userService.add(max);
        userService.add(nika);
        System.out.println(userService.getAll());
    }
}
