package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        User first = new User();
        first.setName("johny");
        first.setAge(22);
        System.out.println(userService.add(first));
        User second = new User();
        second.setName("rony");
        second.setAge(31);
        System.out.println(userService.add(second));

        System.out.println(userService.getAll());
    }
}
