package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User valera = new User();
        valera.setName("Valera");
        User egorka = new User();
        egorka.setName("Egorka");
        UserService userService = context.getBean(UserService.class);
        userService.add(valera);
        userService.add(egorka);
        System.out.println(userService.getAll());
    }
}
