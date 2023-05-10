package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(AppConfig.class);
    private static final UserService userService = context.getBean(UserService.class);

    public static void main(String[] args) {
        User first = new User();
        first.setName("Alice");
        first.setAge(20);
        User second = new User();
        second.setName("Bob");
        second.setAge(30);
        userService.add(first);
        userService.add(second);
        System.out.println(userService.getAll());
    }
}
