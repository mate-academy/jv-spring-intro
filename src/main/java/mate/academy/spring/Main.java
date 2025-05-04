package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        User userAlice = new User();
        userAlice.setName("Alice");
        userAlice.setAge(21);

        UserService userService = context.getBean(UserService.class);
        userService.add(userAlice);
        System.out.println(userService.getAll());
    }
}
