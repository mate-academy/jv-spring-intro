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
        User vasa = new User("Vasa", "1234");
        User petya = new User("Petya", "1234");
        userService.add(vasa);
        userService.add(petya);
        userService.getAll().forEach(System.out::println);
    }
}
