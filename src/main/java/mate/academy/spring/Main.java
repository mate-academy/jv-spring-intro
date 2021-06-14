package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);
    private static final UserService userService = context.getBean(UserService.class);

    public static void main(String[] args) {
        User john = new User();
        john.setFirstName("John");
        john.setLastName("Malkovic");
        john.setAge(23);
        userService.add(john);
        User lusy = new User();
        lusy.setFirstName("Lusy");
        lusy.setLastName("May");
        lusy.setAge(20);
        userService.add(lusy);
        userService.listUsers().forEach(System.out::println);
    }
}
