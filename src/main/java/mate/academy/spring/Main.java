package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        User slava = new User("Slava", "Cheban");
        User sasha = new User("Sasha", "Cheban");
        User olga = new User("Olga", "Cheban");

        userService.add(slava);
        userService.add(sasha);
        userService.add(olga);
        System.out.println(userService.getAll());
    }
}
