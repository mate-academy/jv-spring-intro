package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User taras = new User();
        taras.setEmail("taras@gmail.com");
        taras.setPassword("12345");

        User yura = new User();
        yura.setEmail("yura200@gmail.com");
        yura.setPassword("yura123");

        UserService userService = context.getBean(UserService.class);
        userService.add(taras);
        userService.add(yura);

        userService.listUsers().forEach(System.out::println);
    }
}
