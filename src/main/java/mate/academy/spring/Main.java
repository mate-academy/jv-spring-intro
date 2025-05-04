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
        user.setAge(17);
        user.setName("Andrii");
        UserService userService = context.getBean(UserService.class);
        userService.add(user);
        User user2 = new User();
        user2.setAge(33);
        user2.setName("AndriY");
        userService.add(user2);
        userService.getAll().forEach(System.out::println);
    }
}
