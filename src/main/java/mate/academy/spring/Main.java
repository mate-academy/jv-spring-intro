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

        User bob = new User("Bob", 28);
        User alice = new User("Alice", 23);
        User john = new User("John", 36);

        userService.add(bob);
        userService.add(alice);
        userService.add(john);

        System.out.println(userService.getAll());

    }
}
