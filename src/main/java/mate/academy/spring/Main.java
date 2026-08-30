package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User bob = new User();
        bob.setAge(20);
        bob.setName("Nazar");
        User bobsEvilTwin = new User();
        bobsEvilTwin.setAge(23);
        bobsEvilTwin.setName("Razan");

        UserService userService = context.getBean(UserService.class);
        userService.add(bob);
        userService.add(bobsEvilTwin);

        userService.getAll().forEach(System.out::println);
    }
}
