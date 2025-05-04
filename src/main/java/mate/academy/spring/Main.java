package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User mike = new User();
        mike.setAge(20);
        mike.setName("Mike");

        User alex = new User();
        alex.setName("Alex");
        alex.setAge(30);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(mike);
        userService.add(alex);
        System.out.println(userService.getAll());

    }
}
