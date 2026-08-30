package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {

        UserService userService = context.getBean(UserService.class);
        User bob = new User();
        bob.setName("Bob");
        bob.setAge(20);
        userService.add(bob);
        System.out.println(userService.getAll());
    }
}
