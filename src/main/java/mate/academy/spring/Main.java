package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        User alice = new User("alice@gmail.com", "qwerty");
        User bob = new User("bob@gmail.com", "12345");
        UserService userService = context.getBean(UserService.class);
        userService.add(alice);
        userService.add(bob);
        System.out.println(userService.listUsers());
    }

}
