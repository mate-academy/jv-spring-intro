package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User bobby = new User();
        bobby.setName("Bobby");

        User megatron = new User();
        megatron.setName("MEGATRON");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(bobby);
        userService.add(megatron);

        System.out.println(userService.listUsers());
    }
}
