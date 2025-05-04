package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        User bob = new User();
        bob.setAge(18);
        bob.setName("Bob");
        userService.add(bob);

        User alice = new User();
        alice.setAge(22);
        alice.setName("Alice");
        userService.add(alice);

        System.out.println(userService.getAll());
    }
}
