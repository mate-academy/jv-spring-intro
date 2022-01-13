package mate.academy.spring;

import java.util.List;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        UserService userService = context.getBean(UserService.class);

        User danya = new User();
        danya.setAge(24);
        danya.setName("Danya");
        userService.add(danya);

        User eugen = new User();
        eugen.setAge(21);
        eugen.setName("Eugen");
        userService.add(eugen);

        User paul = new User();
        paul.setAge(28);
        paul.setName("Paul");
        userService.add(paul);

        User alex = new User();
        alex.setAge(28);
        alex.setName("Alex");
        userService.add(alex);

        List<User> allUsers = userService.getAll();
        System.out.println(allUsers);
    }
}
