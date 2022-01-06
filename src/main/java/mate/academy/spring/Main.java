package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User john = new User();
        john.setName("John");
        john.setLastName("Rambo");

        User dean = new User();
        dean.setName("Dean");
        dean.setLastName("Winchester");

        UserService userService = context.getBean(UserService.class);
        userService.add(john);
        userService.add(dean);

        System.out.println(userService.getAll());
    }
}
