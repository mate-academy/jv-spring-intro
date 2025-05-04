package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Bob");
        user.setAge(18);

        AnnotationConfigApplicationContext annotationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = annotationContext.getBean(UserService.class);
        userService.add(user);
        System.out.println(userService.getAll());
    }
}
