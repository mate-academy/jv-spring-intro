package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        User harryPotter = new User("Harry", "Potter");

        User ronWeasley = new User("Ron", "Weasley");

        User hermioneGranger = new User("hHermione", "Granger");

        userService.add(harryPotter);
        userService.add(ronWeasley);
        userService.add(hermioneGranger);

        userService.listUsers().forEach(System.out::println);
    }
}
