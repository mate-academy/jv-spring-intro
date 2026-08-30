package mate.academy.spring;

import java.util.List;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        User bob = new User();
        bob.setName("Bob");
        bob.setAge(30);
        userService.add(bob);
        User alice = new User();
        alice.setName("Alice");
        alice.setAge(18);
        userService.add(alice);
        User mark = new User();
        mark.setName("Mark");
        mark.setAge(18);
        userService.add(mark);

        List<User> userList = userService.getAll();
        System.out.println(userList);
    }
}
