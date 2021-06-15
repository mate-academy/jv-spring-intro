package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User bob = new User();
        bob.setLogin("bob404");
        bob.setEmail("bob404@gmail.com");
        bob.setPassword("Fk)98kl_L");

        User alice = new User();
        alice.setLogin("alice_1");
        alice.setEmail("alice_in_wonderland@gmail.com");
        alice.setPassword("S478ioI765Yuj");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(bob);
        userService.add(alice);

        System.out.println(userService.listUsers());
    }
}
