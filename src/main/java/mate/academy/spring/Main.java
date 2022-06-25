package mate.academy.spring;

import mate.academy.spring.configuration.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        User finn = new User();
        finn.setName("Finn");
        finn.setAge(23);
        userService.add(finn);
        User jake = new User();
        jake.setName("Jake");
        jake.setAge(21);
        userService.add(jake);
        System.out.println(userService.getAll());
    }
}
