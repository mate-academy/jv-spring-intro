package mate.academy.spring;

import java.util.List;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        User danya = new User();
        danya.setAge(24);
        danya.setName("Danechka");
        userService.add(danya);

        User andrew = new User();
        andrew.setAge(21);
        andrew.setName("Andrewshechka");
        userService.add(andrew);

        User paul = new User();
        paul.setAge(26);
        paul.setName("Pashecka");
        userService.add(paul);

        User ilya = new User();
        ilya.setAge(19);
        ilya.setName("Ilyshecka");
        userService.add(ilya);

        User alex = new User();
        alex.setAge(28);
        alex.setName("Sanyechka");
        userService.add(alex);

        List<User> gachiUsers = userService.getAll();
        System.out.println(gachiUsers);
    }
}
