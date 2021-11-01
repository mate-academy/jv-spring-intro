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
        User bob = new User("bob", "bobb@gmail.com", "123456");
        userService.add(bob);
        User anna = new User("anna", "anna@gmail.com", "annnnna");
        userService.add(anna);
        User kiril = new User("kiril", "kkiril@gmail.com", "kirilll");
        userService.add(kiril);

        userService.getAll().forEach(System.out::println);
    }
}
