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

        User firstUser = new User();
        firstUser.setName("Bob");
        firstUser.setAge(22);
        userService.add(firstUser);
        User secondUser = new User();
        secondUser.setName("Alice");
        secondUser.setAge(18);
        userService.add(secondUser);
        System.out.println(userService.getAll());

    }
}
