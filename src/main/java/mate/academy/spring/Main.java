package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User mike = new User();
        mike.setAge(24);
        mike.setName("Me");
        UserService userService = context.getBean(UserService.class);
        userService.add(mike);
        userService.getAll().forEach(System.out::println);
    }
}
