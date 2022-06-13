package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        User firstUser = new User();
        firstUser.setAge(30);
        firstUser.setName("Ana");
        User secondUser = new User();
        secondUser.setName("Bob");
        secondUser.setAge(31);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(firstUser);
        userService.add(secondUser);
        userService.getAll().forEach(System.out::println);
    }
}
