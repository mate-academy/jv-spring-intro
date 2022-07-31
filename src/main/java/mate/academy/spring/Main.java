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

        User alex = new User();
        alex.setName("alex");
        alex.setAge(39);
        userService.add(alex);

        User serge = new User();
        serge.setName("serge");
        serge.setAge(44);
        userService.add(serge);

        userService.getAll().forEach(System.out::println);
    }
}
