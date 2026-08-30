package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User userLuka = new User();
        userLuka.setAge(20);
        userLuka.setName("Luka");

        User userAlice = new User();
        userAlice.setAge(15);
        userAlice.setName("Alice");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        System.out.println("First added user: " + userService.add(userLuka));
        System.out.println("Second added user: " + userService.add(userAlice));

        System.out.println(userService.getAll());
    }
}
