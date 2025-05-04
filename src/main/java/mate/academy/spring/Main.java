package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User old = new User();
        old.setAge(40);
        old.setName("OldNoname");
        User yang = new User();
        yang.setAge(15);
        yang.setName("Noname");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        System.out.println("Yang:" + userService.add(yang));
        System.out.println("Old: " + userService.add(old));
        System.out.println(userService.getAll());
    }
}
