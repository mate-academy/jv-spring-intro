package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        User firstUser = new User();
        firstUser.setAge(20);
        firstUser.setName("First");

        User secondUser = new User();
        secondUser.setAge(18);
        secondUser.setName("Second");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(firstUser);
        userService.add(secondUser);
        System.out.println(userService.getAll());
    }
}
