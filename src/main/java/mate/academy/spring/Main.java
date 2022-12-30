package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(AppConfig.class);
    private static final UserService userService = context.getBean(UserService.class);

    public static void main(String[] args) {
        User user = new User();
        user.setName("Ivan");
        user.setAge(38);

        System.out.println(userService.add(user));
        userService.getAll().forEach(System.out::println);
    }
}
