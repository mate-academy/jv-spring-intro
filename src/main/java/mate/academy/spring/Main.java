package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.SpringVersion;

public class Main {
    public static void main(String[] args) {
        User userBob = new User();
        userBob.setAge(29);
        userBob.setName("Bob");

        User userAlice = new User();
        userAlice.setAge(22);
        userAlice.setName("Alice");

        User userJohn = new User();
        userJohn.setAge(23);
        userJohn.setName("John");

        System.out.println(SpringVersion.getVersion());

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(userBob);
        userService.add(userAlice);
        userService.add(userJohn);

        System.out.println(userService.getAll());
    }
}
