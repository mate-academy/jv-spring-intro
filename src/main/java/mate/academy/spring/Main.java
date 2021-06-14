package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        UserService userService = context.getBean(UserService.class);
        User user = new User("good@gmail.com", "qwerty1234");
        User user2 = new User("bad@gmail.com", "1111");
        userService.add(user);
        userService.add(user2);
        userService.listUsers().forEach(System.out::println);
    }
}
