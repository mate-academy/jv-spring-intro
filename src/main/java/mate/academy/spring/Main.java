package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Volodymyr");
        user.setLastName("Panchenko");
        User user1 = new User();
        user1.setFirstName("Olena");
        user1.setLastName("Panchenko");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(user);
        userService.add(user1);
        userService.getAll().forEach(System.out::println);
    }
}
