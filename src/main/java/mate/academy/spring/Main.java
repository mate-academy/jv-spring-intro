package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        User dana = new User("Dana", "Khromenko");
        User natalie = new User("Natalie", "Didyk");

        userService.add(dana);
        userService.add(natalie);

        System.out.println("All users from DB:");
        userService.getAll().forEach(System.out::println);
    }
}
