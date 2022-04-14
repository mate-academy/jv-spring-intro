package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User victor = new User();
        victor.setAge(25);
        victor.setName("Victor");

        User lea = new User();
        lea.setAge(18);
        lea.setName("Lea");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(victor);
        userService.add(lea);

        System.out.println(userService.getAll());
    }
}
