package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        User userOne = new User();
        userOne.setName("userOne");
        userOne.setAge(20);
        userService.add(userOne);

        User userTwo = new User();
        userTwo.setName("userTwo");
        userTwo.setAge(21);
        userService.add(userTwo);

        System.out.println(userService.getAll());
    }
}
