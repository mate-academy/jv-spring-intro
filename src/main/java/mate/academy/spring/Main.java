package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User jaina = new User();
        jaina.setFirstName("Jaina");
        jaina.setLastName("Proudmoore");
        jaina.setEmail("email@newone.com");

        User arthas = new User();
        arthas.setFirstName("Arthas");
        arthas.setLastName("Menetil");
        arthas.setEmail("lichKing@prince.com");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(jaina);
        userService.add(arthas);
        userService.getAll().forEach(System.out::println);
    }
}
