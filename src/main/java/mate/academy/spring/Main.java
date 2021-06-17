package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        User julia = new User("julia1@gmail.com", "89jhgdnn7");

        User ivan = new User("ivan87@gmail.com","justsomerandomnumber45678444");

        userService.add(julia);
        userService.add(ivan);
        System.out.println(userService.listUsers());
    }
}
