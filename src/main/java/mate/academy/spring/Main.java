package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user1 = new User();
        user1.setName("User 1");
        user1.setAge(23);
        UserService userService = context.getBean(UserService.class);
        userService.add(user1);
        User user2 = new User();
        user2.setName("User 2");
        user1.setAge(25);
        userService.add(user2);
        userService.getAll().forEach(System.out::println);
    }
}
