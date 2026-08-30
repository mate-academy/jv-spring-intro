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
        userService.add(new User("Max", 31));
        userService.add(new User("Marina", 32));
        userService.add(new User("Petya", 40));
        userService.add(new User("Vasya", 25));

        userService.getAll().forEach(System.out::println);
    }
}
