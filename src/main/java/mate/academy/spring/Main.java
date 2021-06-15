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

        User bob = new User(2L,"bob@gmail.com", "bobsPassword");
        userService.add(bob);

        User alice = new User(1L,"alice@gmail.com", "alicePassword");
        userService.add(alice);

        userService.listUsers().forEach(System.out::println);
    }
}


