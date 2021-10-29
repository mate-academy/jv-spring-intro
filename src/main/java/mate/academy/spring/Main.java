package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User userFirst = new User("Serhii", "Orlov");
        UserService userService = context.getBean(UserService.class);
        userService.add(userFirst);
        System.out.println("-----------Test----one-person------------------------");
        System.out.println(userService.getAll());
        User userSecond = new User("Bohdan", "Chupika");
        userService.add(userSecond);
        System.out.println();
        System.out.println("-----------Test----two-persons-----------------------");
        System.out.println(userService.getAll());
    }
}
