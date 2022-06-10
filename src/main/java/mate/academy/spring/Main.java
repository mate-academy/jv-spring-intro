package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User robert = new User();
        robert.setName("Robert");
        robert.setAge(30);

        User jennifer = new User();
        jennifer.setName("Jennifer");
        jennifer.setAge(27);

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(robert);
        userService.add(jennifer);

        userService.getAll().forEach(System.out::println);
    }
}
