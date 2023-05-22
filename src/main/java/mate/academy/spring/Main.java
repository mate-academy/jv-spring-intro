package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        // create users
        User bob = new User();
        bob.setName("Bob");
        bob.setAge(25);

        User alise = new User();
        alise.setName("Alise");
        alise.setAge(20);

        // add users
        UserService userService = context.getBean(UserService.class);

        userService.add(bob);
        userService.add(alise);

        // print users
        System.out.println(userService.getAll());
    }
}
