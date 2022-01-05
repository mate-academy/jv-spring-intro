package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User elon = new User();
        elon.setName("Elon");
        elon.setPassword("MyBigRocket");
        User steven = new User();
        steven.setName("Steven");
        steven.setPassword("EnlightenedMe");
        UserService userService = context.getBean(UserService.class);
        userService.add(elon);
        userService.add(steven);
        System.out.println(userService.getAll());
    }
}
