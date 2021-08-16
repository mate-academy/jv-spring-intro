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
        User danile = new User();
        danile.setLogin("danile@gmail.com");
        danile.setPassword("password".toCharArray());

        User kuruch = new User();
        kuruch.setLogin("kuruch@gmail.com");
        kuruch.setPassword("password123".toCharArray());

        User danile_kuruch = new User();
        danile_kuruch.setLogin("danile_kuruch@gmail.com");
        danile_kuruch.setPassword("password_qwerty".toCharArray());

        userService.add(danile);
        userService.add(kuruch);
        userService.add(danile_kuruch);
        System.out.println(userService.findByEmail(danile.getLogin()));
        System.out.println(userService.findByEmail(kuruch.getLogin()));
        System.out.println(userService.findByEmail(danile_kuruch.getLogin()));
        userService.delete(danile);
        try {
            System.out.println(userService.getById(1L));
        } catch (NoSuchElementException e) {
            System.out.println("User is deleted");
        }
    }
}
