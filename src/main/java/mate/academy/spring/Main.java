package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User angie = new User();
        angie.setAge(47);
        angie.setName("Angelina");

        User johnny = new User();
        johnny.setName("Johnny");
        johnny.setAge(59);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        userService.add(angie);
        userService.add(johnny);
        System.out.println(userService.getAll());
    }
}
