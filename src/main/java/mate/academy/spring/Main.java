package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context;

    static {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    public static void main(String[] args) {
        User bob = new User("bob");
        User alice = new User("alice");

        UserService userService = context.getBean(UserService.class);
        userService.add(bob);
        userService.add(alice);
        System.out.println(userService.listUsers());
    }
}
