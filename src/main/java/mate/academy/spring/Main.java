package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User bob = new User("Bob", "USA");
        User alice = new User("Alice", "Canada");
        User john = new User("John", "Mexico");

        UserService userService = context.getBean(UserService.class);
        userService.add(bob);
        userService.add(alice);
        userService.add(john);

        System.out.println(userService.listUsers());
    }
}
