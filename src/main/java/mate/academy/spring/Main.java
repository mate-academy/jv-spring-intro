package mate.academy.spring;

import java.util.List;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User firstUser = new User();
        firstUser.setAge(20);
        firstUser.setName("Nick");
        User secondUser = new User();
        secondUser.setAge(45);
        secondUser.setName("Alex");
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(firstUser);
        userService.add(secondUser);
        List<User> all = userService.getAll();
        System.out.println(all);
    }
}
