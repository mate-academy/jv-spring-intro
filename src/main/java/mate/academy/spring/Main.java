package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final UserService userService =
            new AnnotationConfigApplicationContext(AppConfig.class).getBean(UserService.class);

    public static void main(String[] args) {
        User user = new User();
        user.setAge(33);
        user.setName("Cows");
        userService.add(user);
        userService.getAll().forEach(System.out::println);
    }
}
