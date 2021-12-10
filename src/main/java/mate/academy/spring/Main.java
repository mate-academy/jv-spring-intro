package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User vitalii = new User();
        vitalii.setUsername("imiFrank");
        vitalii.setPassword("32145");

        User pavlo = new User();
        pavlo.setUsername("sveryd");
        pavlo.setPassword("1234");

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        userService.add(vitalii);
        userService.add(pavlo);

        System.out.println(userService.getAll());
    }
}
