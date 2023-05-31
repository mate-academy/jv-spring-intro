package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        User user1 = new User();
        user1.setName("Anton");
        user1.setAge(32);

        User user2 = new User();
        user2.setName("Bob");
        user2.setAge(44);

        User user3 = new User();
        user3.setName("Alice");
        user3.setAge(28);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(user1);
        userService.add(user2);
        userService.add(user3);
        System.out.println(userService.getAll());

    }
}
