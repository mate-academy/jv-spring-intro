package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context;

    static {
        context = new AnnotationConfigApplicationContext(AppConfig.class);

    }

    public static void main(String[] args) {
        UserService userService = context.getBean(UserService.class);
        userService.add(new User("manko@ukr.net", "1234"));
        userService.add(new User("ira@ukr.net", "4567"));

        userService.listUsers()
                .forEach(user -> System.out.println(user.getId() + " - " + user.getEmail()));
    }
}
