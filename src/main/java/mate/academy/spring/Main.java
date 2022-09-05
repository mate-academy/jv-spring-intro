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

        User nazar = new User("Nazar", 22);
        User alice = new User("Alice", 25);
        User bob = new User("Bob", 19);

        userService.add(nazar);
        userService.add(alice);
        userService.add(bob);

        System.out.println(userService.getAll());
    }
}
