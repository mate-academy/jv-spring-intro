package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User alisa = new User();
        alisa.setAge(20);
        alisa.setName("Alisa");
        //
        User bob = new User();
        bob.setAge(20);
        bob.setName("Bob");
        //
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.add(bob));
        System.out.println(userService.add(alisa));
        System.out.println("\n\n");
        System.out.println(userService.getAll());
    }
}
