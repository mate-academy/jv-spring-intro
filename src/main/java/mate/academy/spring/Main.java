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
        firstUser.setFirstName("User1 FirstName");

        User secondUser = new User();
        secondUser.setLastName("User2 LastName");

        userService.add(firstUser);
        userService.add(secondUser);

        System.out.println(userService.listUsers());
    }
}
