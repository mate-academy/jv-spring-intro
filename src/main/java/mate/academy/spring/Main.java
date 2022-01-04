package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User userFirst = new User();
        userFirst.setAge(20);
        userFirst.setName("Bob");
        User userSecond = new User();
        userSecond.setAge(40);
        userSecond.setName("Alice");
        UserService userService = context.getBean(UserService.class);
        userService.add(userFirst);
        userService.add(userSecond);
        System.out.println(userService.getAll());
    }
}
