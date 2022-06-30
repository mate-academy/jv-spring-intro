package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User den = new User();
        den.setName("Den");
        den.setAge(33);

        User mak = new User();
        mak.setName("Mak");
        mak.setAge(11);

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        System.out.println("userService.getAll() = " + userService.getAll());
    }
}
