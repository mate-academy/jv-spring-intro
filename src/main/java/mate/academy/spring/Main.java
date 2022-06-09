package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        User alice = new User();
        alice.setName("Alice");
        alice.setAge(30);
        userService.add(alice);

        User john = new User();
        john.setName("John");
        john.setAge(45);
        userService.add(john);

        userService.getAll().forEach(System.out::println);
    }
}
