package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User anya = new User();
        anya.setEmail("Olya123@gmail.com");
        User nastya = new User();
        nastya.setEmail("Nastia123@gmail.com");

        UserService userService = context.getBean(UserService.class);
        userService.add(anya);
        userService.add(nastya);

        userService.getAll().forEach(System.out::println);
    }
}
