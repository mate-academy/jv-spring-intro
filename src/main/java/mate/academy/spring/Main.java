package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(AppConfig.class);
    private static final UserService userService = applicationContext.getBean(UserService.class);
    private static final String USER_NAME = "User";
    private static final Integer USER_AGE = 18;
    private static final String BOB_NAME = "Bob";
    private static final Integer BOB_AGE = 25;

    public static void main(String[] args) {
        User user = new User();
        user.setName(USER_NAME);
        user.setAge(USER_AGE);
        userService.add(user);

        User bob = new User();
        bob.setName(BOB_NAME);
        bob.setAge(BOB_AGE);

        System.out.println(userService.getAll());
    }
}
