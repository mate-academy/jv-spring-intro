package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        final UserService userService = context.getBean(UserService.class);

        final User stepan = new User();
        stepan.setAge(27);
        stepan.setName("Stepan");

        final User oksana = new User();
        stepan.setAge(31);
        stepan.setName("Oksana");

        userService.add(stepan);
        userService.add(oksana);

        System.out.println(userService.getAll());
    }
}
