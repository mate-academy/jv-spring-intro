package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User bob = new User();
        bob.setName("Bob");
        bob.setAge(33);

        User alice = new User();
        alice.setName("Alice");
        alice.setAge(30);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(bob);
        System.out.println("Bob was added successful");
        userService.add(alice);
        System.out.println("Alice was added successful");
        User userFromDB = userService.get(bob.getId());
        System.out.println("User from DB: " + userFromDB);
        userService.getAll().forEach(System.out::println);
    }
}
