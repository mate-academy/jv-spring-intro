package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        User firstUser = new User();
        firstUser.setName("First");
        firstUser.setAge(20);
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(firstUser);
        User secondUser = new User();
        firstUser.setName("Second");
        firstUser.setAge(30);
        userService.add(secondUser);
        System.out.println(userService.getAll());
    }
}
