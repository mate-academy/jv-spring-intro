package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User vasya = new User("Vasya", "Pupkin");
        User petryk = new User("Petryk", "Piatochkin");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(vasya);
        userService.add(petryk);
        userService.getAll().forEach(System.out::println);
    }
}
