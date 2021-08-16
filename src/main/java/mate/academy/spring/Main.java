package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static AnnotationConfigApplicationContext configApplicationContext =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User tom = new User("Tom","1234");
        User bob = new User("Bob", "1234");
        User nick = new User("Nick", "4321");
        UserService userService = configApplicationContext.getBean(UserService.class);
        userService.add(tom);
        userService.add(bob);
        userService.add(nick);
        System.out.println(userService.getAll());
    }
}
