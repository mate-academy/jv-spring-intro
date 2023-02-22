package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.dao.impl.UserDaoImpl;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import mate.academy.spring.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        User user = new User("Max", 21);
        userService.add(user);

        System.out.println(userService.getAll());
    }
}
