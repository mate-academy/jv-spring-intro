package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User userOne = new User();
        userOne.setName("Bob");
        userOne.setEmail("guru@mail.com");
        UserService userService = context.getBean(UserService.class);
        userService.add(userOne);
        System.out.println(userService.getAll());
    }
}
