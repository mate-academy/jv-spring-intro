package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User firstUser = new User();
        firstUser.setName("Bob");
        firstUser.setAge(18);
        User secondUser = new User();
        secondUser.setName("Alice");
        secondUser.setAge(20);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        userService.add(firstUser);
        userService.add(secondUser);

        userService.getAll().stream().forEach(System.out::println);
    }
}
