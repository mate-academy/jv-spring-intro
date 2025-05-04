package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = annotationConfigApplicationContext.getBean(UserService.class);

        System.out.println(userService.add(new User(15, "Bob")));
        System.out.println(userService.add(new User(25, "Alice")));
        System.out.println(userService.getAll());
    }
}
