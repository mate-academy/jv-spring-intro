package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        UserService userService = context.getBean(UserService.class);
        User warrior = new User("internetwarrior@gmail.com", "fight");
        User defender = new User("internetdefender@gmail.com", "stop");
        userService.add(warrior);
        userService.add(defender);
        userService.getAll().forEach(System.out::println);
    }
}
