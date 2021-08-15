package mate.academy.spring;

import java.util.NoSuchElementException;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);
    private static final UserService userService = context.getBean(UserService.class);

    public static void main(String[] args) {
        User user = new User();
        user.setLogin("kuruch1004@gmail.com");
        user.setPassword("password".toCharArray());

        User user1 = new User();
        user1.setLogin("kuruch@gmail.com");
        user1.setPassword("password123".toCharArray());

        User user2 = new User();
        user2.setLogin("kuruch10@gmail.com");
        user2.setPassword("password_qwerty".toCharArray());

        userService.add(user);
        userService.add(user1);
        userService.add(user2);
        System.out.println(userService.findByEmail(user.getLogin()));
        System.out.println(userService.findByEmail(user1.getLogin()));
        System.out.println(userService.findByEmail(user2.getLogin()));
        userService.delete(user);
        try {
            System.out.println(userService.getById(1L));
        } catch (NoSuchElementException e) {
            System.out.println("User is deleted");
        }
    }
}
