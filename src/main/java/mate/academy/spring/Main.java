package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);
    private static final UserService userService = context.getBean(UserService.class);

    public static void main(String[] args) {
        User bob = new User("Bob", 20);
        User alice = new User("Alice", 19);
        User bill = new User("Bill", 23);
        userService.add(bob);
        userService.add(bill);
        userService.add(alice);
        System.out.println(userService.getAll());

    }
}
