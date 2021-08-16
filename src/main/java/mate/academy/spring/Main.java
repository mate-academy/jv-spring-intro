package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User bob = new User("Bob");
        User alice = new User("Alice");
        User kate = new User("Kate");

        UserService userService = context.getBean(UserService.class);
        userService.add(bob);
        userService.add(alice);
        userService.add(kate);

        userService.getAll().forEach(System.out::println);
        System.out.println();

        User matthew = new User("Matthew");
        userService.add(matthew);

        userService.getAll().forEach(System.out::println);
    }
}
