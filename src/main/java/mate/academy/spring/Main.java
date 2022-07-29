package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User anton = new User();
        anton.setName("Anton");
        anton.setAge(11);

        User chris = new User();
        chris.setName("Chris");
        chris.setAge(11);

        User den = new User();
        den.setName("Den");
        den.setAge(13);

        User kate = new User();
        kate.setName("Kate");
        kate.setAge(22);

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(anton);
        userService.add(chris);
        userService.add(den);
        userService.add(kate);

        userService.getAll().forEach(System.out::println);
    }
}
