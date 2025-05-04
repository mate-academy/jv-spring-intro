package mate.academy.spring;

import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User bob = new User();
        bob.setName("Bob");
        bob.setAge(22);
        User alice = new User();
        alice.setName("Alice");
        alice.setAge(21);
        ApplicationContext context
                = new AnnotationConfigApplicationContext("mate.academy.spring.config");
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.add(bob));
        System.out.println(userService.add(alice));
        System.out.println(userService.getAll());
    }
}
