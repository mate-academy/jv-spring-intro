package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = annotationConfigApplicationContext.getBean(UserService.class);

        User bob = new User();
        User alice = new User();
        User kath = new User();

        userService.add(bob);
        userService.add(alice);
        userService.add(kath);

        System.out.println(userService.getAll());
    }
}
