package mate.academy.spring;

import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        User bob = new User(25, "Bob");
        User alice = new User(24, "Alice");

        System.out.println(userService.add(bob));
        System.out.println(userService.add(alice));

        System.out.println(userService.getAll());
    }
}
