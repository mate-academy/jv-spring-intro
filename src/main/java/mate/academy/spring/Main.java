package mate.academy.spring;

import mate.academy.spring.config.ApplicationContext;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setEmail("email@.com");
        user.setPassword("somePassword");
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(ApplicationContext.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(user);
        userService.getAllUsers().forEach(System.out::println);

    }
}
