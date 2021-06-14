package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User john = new User("John", "Doe", 27);
        User peter = new User("Peter", "Anderson", 30);
        User samuel = new User("Samuel", "Hayden", 35);
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(john);
        userService.add(peter);
        userService.add(samuel);
        userService.getAllUsers().forEach(System.out::println);
    }
}
