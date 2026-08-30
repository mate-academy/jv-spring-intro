package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User userOlexii = new User();
        userOlexii.setAge(15);
        userOlexii.setName("Olexii");

        User userViktoria = new User();
        userViktoria.setAge(12);
        userViktoria.setName("Viktoria");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        userService.add(userOlexii);
        userService.add(userViktoria);

        System.out.println(userService.getAll());
    }
}
