package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        User first = new User();
        first.setAge(20);
        first.setName("Dima");
        User second = new User();
        second.setName("Evan");
        second.setAge(23);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(first);
        userService.add(second);
        userService.getAll().forEach(System.out::println);
    }
}
