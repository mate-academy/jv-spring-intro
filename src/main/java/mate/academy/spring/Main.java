package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User alex = new User();
        User don = new User();
        alex.setName("Alex");
        don.setName("Don");
        UserService userService = context.getBean(UserService.class);
        userService.add(alex);
        userService.add(don);
        System.out.println(userService.getAll());
    }
}
