package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static final int AGE = 29;
    public static final String NAME = "Bob";

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);
        User user = new User();
        user.setAge(AGE);
        user.setName(NAME);
        System.out.println(userService.add(user));
        System.out.println(userService.getAll());
    }
}
