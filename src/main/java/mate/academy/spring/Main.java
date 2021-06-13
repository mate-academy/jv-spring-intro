package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User alice = new User();
        alice.setEmail("alice@gmail.com");
        alice.setPassword("1234");
        User bob = new User();
        bob.setEmail("bob@gmail.com");
        bob.setPassword("bob1234");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(alice);
        userService.add(bob);
        System.out.println(userService.listUsers());
    }
}
