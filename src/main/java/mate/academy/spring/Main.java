package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User nif = new User("Nif");
        User naf = new User("Naf");
        User nouf = new User("Nouf");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(nif);
        userService.add(naf);
        userService.add(nouf);
        userService.listUsers().forEach(System.out::println);
    }
}
