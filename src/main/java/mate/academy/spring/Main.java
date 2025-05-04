package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setId(1L);
        user.setName("bob");
        user.setAge(25);

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.add(user));
        System.out.println(userService.getAll());

    }
}
