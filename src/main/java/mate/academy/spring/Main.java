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

        User chris = new User("Chris", 21, "visitor");
        userService.add(chris);
        User morgan = new User("Morgan", 23, "owner");
        userService.add(morgan);

        userService.listUsers().forEach(System.out::println);
    }
}
