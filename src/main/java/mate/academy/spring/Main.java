package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        UserService userService = context.getBean(UserService.class);

        User bohdan = new User("Bohdan", "Chupika", 18);
        User bob = new User("Bob", "Bobby", 72);

        System.out.println(userService.add(bohdan));
        System.out.println(userService.add(bob));
        System.out.println(userService.listUsers());

    }
}
