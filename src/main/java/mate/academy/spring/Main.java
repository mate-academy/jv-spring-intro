package mate.academy.spring;

import mate.academy.spring.config.SpringConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext configContext =
            new AnnotationConfigApplicationContext(SpringConfig.class);

    public static void main(String[] args) {
        UserService userService = configContext.getBean(UserService.class);

        User thomas = new User("Thomas", 32);
        userService.add(thomas);
        userService.getAll().forEach(System.out::println);
    }
}
