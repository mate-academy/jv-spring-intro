package mate.academy.spring;

import java.util.stream.Collectors;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(AppConfig.class);
    private static final UserService userService = context.getBean(UserService.class);

    public static void main(String[] args) {
        User bob = new User();
        bob.setName("Bob");
        bob.setAge(19);
        User alice = new User();
        alice.setName("Alice");
        alice.setAge(25);
        User ivan = new User();
        ivan.setName("Ivan");
        ivan.setAge(44);
        userService.add(bob);
        userService.add(alice);
        userService.add(ivan);
        System.out.println(userService.getAll().stream()
                .map(Object::toString)
                .collect(Collectors.joining(", ")));
    }
}
