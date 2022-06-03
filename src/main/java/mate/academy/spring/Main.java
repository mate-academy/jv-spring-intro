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

        User userSerhii = new User();
        userSerhii.setAge(40);
        userSerhii.setName("Serhii");
        userService.add(userSerhii);

        User userDamir = new User();
        userDamir.setAge(1);
        userDamir.setName("Damir");
        userService.add(userDamir);

        userService.getAll().forEach(System.out::println);
    }
}
