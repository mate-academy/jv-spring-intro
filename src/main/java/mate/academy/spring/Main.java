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

        User user1 = new User();
        user1.setAge(20);
        user1.setName("Bob");
        userService.add(user1);

        User user2 = new User();
        user2.setAge(22);
        user2.setName("Bill");
        userService.add(user2);

        userService.getAll().forEach(System.out::println);
    }
}
