package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User cat = new User();
        cat.setAge(30);
        cat.setName("Tom");

        User mouse = new User();
        mouse.setAge(20);
        mouse.setName("Jerry");

        UserService userService = context.getBean(UserService.class);
        userService.add(cat);
        userService.add(mouse);

        userService.getAll().forEach(System.out::println);
    }
}
