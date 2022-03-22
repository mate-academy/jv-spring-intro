package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        User user = userService.add(getNewUser("email.two"));
        System.out.println(user);
        userService.add(getNewUser("email.one"));
        System.out.println(userService.getAll());
    }

    private static User getNewUser(String email) {
        User user = new User();
        user.setEmail(email);
        return user;
    }
}
