package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);
    private static UserService userService = context.getBean(UserService.class);

    public static void main(String[] args) {
        System.out.println("CREATING USERS");
        User alex = new User();
        alex.setName("Alex");
        alex.setAge(21);

        User bob = new User();
        bob.setName("Bob");
        bob.setAge(30);

        User alexFromDb = userService.add(alex);
        User bobFromDb = userService.add(bob);
        System.out.println(alexFromDb);
        System.out.println(bobFromDb);

        System.out.println(userService.getAll());
    }
}
