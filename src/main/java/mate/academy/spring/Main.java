package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        User user = new User();
        user.setName("Olga");
        user.setAge(25);
        UserService userService = context.getBean(UserService.class);
        userService.add(user);
        System.out.println(userService.getAll());
    }
}
