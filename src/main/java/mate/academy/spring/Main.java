package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        UserService userService = context.getBean(UserService.class);
        User donald = new User("imNotDuckIamTrump@gmail.com", "presidentForever2050");
        User jhon = new User("JhonSnow@gmail.com", "winterComing");
        userService.add(donald);
        userService.add(jhon);
        userService.findAllUsers();
    }
}
