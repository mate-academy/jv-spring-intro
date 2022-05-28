package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        User goga = new User();
        goga.setName("Goga");
        goga.setAge(19);
        User magoga = new User();
        magoga.setName("Magoga");
        magoga.setAge(20);
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.add(goga));
        System.out.println(userService.add(magoga));
        System.out.println(userService.getAll());
    }
}
