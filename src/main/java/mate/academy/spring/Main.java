package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import mate.academy.spring.util.HashUtil;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User bob = new User();
        bob.setLogin("Bob");
        bob.setSalt(HashUtil.getSalt());
        bob.setPassword(HashUtil.hashPassword("123", bob.getSalt()));

        User alice = new User();
        alice.setLogin("Alice");
        alice.setSalt(HashUtil.getSalt());
        alice.setPassword(HashUtil.hashPassword("456", alice.getSalt()));

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(bob);
        userService.add(alice);

        System.out.println(userService.listUsers());
    }
}
