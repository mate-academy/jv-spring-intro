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
        System.out.println("\n############ TESTS FROM MAIN ############\n");
        User bob = new User("Bob", 20);
        User alice = new User("Alice", 18);
        userService.add(bob);
        userService.add(alice);
        userService.getAll().forEach(System.out::println);
    }
}
