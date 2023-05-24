package mate.academy.spring;

import java.util.List;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserServiceImpl userService = context.getBean(UserServiceImpl.class);
        User eslava = new User();
        eslava.setAge(20);
        eslava.setName("Eslava");
        userService.add(eslava);
        List<User> userList = userService.getAll();
        userList.forEach(System.out::println);
    }
}
