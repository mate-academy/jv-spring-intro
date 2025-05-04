package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User userLucas = new User();
        userLucas.setName("Lucas");
        userLucas.setAge(32);

        User userAndrew = new User();
        userAndrew.setName("Andrew");
        userAndrew.setAge(23);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);
        userService.add(userLucas);
        userService.add(userAndrew);
        userService.getAll().forEach(System.out::println);
    }
}
