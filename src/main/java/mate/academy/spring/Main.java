package mate.academy.spring;

import java.util.List;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext CONTEXT
            = new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        UserService userService = CONTEXT.getBean(UserService.class);
        List<User> users = List.of(User.builder().email("bob@gmail.com").password("123456").build(),
                User.builder().email("alice@gmail.com").password("741258").build());
        users.forEach(userService::add);
        userService.getAll().forEach(System.out::println);
    }
}
