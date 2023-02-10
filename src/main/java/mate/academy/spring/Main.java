package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User bob = new User();
        bob.setAge(18);
        bob.setName("Bob");
        User max = new User();
        max.setAge(22);
        max.setName("Max");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.add(bob));
        System.out.println(userService.add(max));
        System.out.println(userService.getAll());
    }
}
