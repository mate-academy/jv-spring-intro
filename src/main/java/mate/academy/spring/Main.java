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
        User denis = new User();
        denis.setName("denis");
        denis.setAge(18);
        System.out.println(userService.add(denis));
        User max = new User();
        max.setName("Max");
        max.setAge(20);
        System.out.println(userService.add(max));
        System.out.println(userService.getAll());
    }
}
