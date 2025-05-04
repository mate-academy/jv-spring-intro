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
        User user = new User();
        user.setName("Oleg");
        user.setAge(19);
        userService.add(user);
        user.setName("Anna");
        user.setAge(20);
        userService.add(user);
        user.setName("Vlad");
        user.setAge(18);
        userService.add(user);
        System.out.println(userService.getAll());
    }
}
