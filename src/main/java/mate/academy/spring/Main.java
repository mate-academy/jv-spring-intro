package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User jack = new User();
        jack.setName("Jack");
        jack.setAge(20);
        User clark = new User();
        clark.setName("Clark");
        clark.setAge(35);
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(jack);
        userService.add(clark);
        System.out.println(userService.getAll());
    }
}
