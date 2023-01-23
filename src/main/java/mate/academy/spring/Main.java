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
        User ann = new User();
        ann.setName("Jerry");
        ann.setAge(20);
        userService.add(ann);
        User daniel = new User();
        daniel.setName("Sofi");
        daniel.setAge(19);
        userService.add(daniel);

        System.out.println(userService.getAll());
    }
}
