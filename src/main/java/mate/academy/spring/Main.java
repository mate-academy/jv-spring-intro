package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        User a = new User("a@gmail.com", "aaaa");
        User b = new User("b@gmail.com", "bbbb");
        UserService userService = context.getBean(UserService.class);
        userService.add(a);
        userService.add(b);
        System.out.println(userService.listUsers());
    }
}
