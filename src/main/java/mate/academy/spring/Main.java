package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User bob = new User("bob@gmail", 40);
        User alisa = new User("alise@gmail", 39);
        User john = new User("john@gmail", 25);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        //        userService.add(bob);
        //        userService.add(alisa);
        //        userService.add(john);

        userService.getAll().forEach(x -> System.out.println(x));
    }
}
