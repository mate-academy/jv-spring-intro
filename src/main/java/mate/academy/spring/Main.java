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

        User bob = new User();
        bob.setName("Bob");
        bob.setAge(33);
        userService.add(bob);

        User alice = new User();
        alice.setName("Alice");
        alice.setAge(19);
        userService.add(alice);

        System.out.println(userService.getAll());
    }
}
