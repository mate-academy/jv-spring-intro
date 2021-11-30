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
        User tinkyWinky = new User();
        tinkyWinky.setName("Tinky Winky");
        userService.add(tinkyWinky);
        User dipsy = new User();
        dipsy.setName("Dipsy");
        userService.add(dipsy);
        userService.getAll().forEach(System.out::println);
    }
    
}
