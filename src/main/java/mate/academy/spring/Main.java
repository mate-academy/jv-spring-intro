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
        user.setAge(25);
        user.setName("Vlad");
        userService.add(user);

        User user1 = new User();
        user1.setAge(25);
        user1.setName("Vlad");
        userService.add(user1);
    }
}
