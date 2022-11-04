package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user1 = new User(20, "kopipaster2000");
        User user2 = new User(30, "kalostrel3000");

        UserService userService = context.getBean(UserService.class);
        userService.add(user1);
        userService.add(user2);

        System.out.println(userService.getAll());
    }
}
