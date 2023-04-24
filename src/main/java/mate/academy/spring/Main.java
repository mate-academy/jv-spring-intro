package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User marina = new User();
        marina.setName("Marina");
        marina.setAge(27);
        User vitalii = new User();
        vitalii.setName("Vitalii");
        vitalii.setAge(34);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(marina);
        userService.add(vitalii);
        userService.getAll().forEach(System.out::println);
    }
}
