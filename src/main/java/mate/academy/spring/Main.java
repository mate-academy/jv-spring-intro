package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.exception.UserNotSavedException;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Maksym", 21);
        User user2 = new User("Ivan", 33);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService service = context.getBean(UserService.class);
        try {
            service.add(user1);
            service.add(user2);
        } catch (UserNotSavedException e) {
            e.printStackTrace();
        }
        service.getAll().forEach(u -> System.out.println(u.toString()));
    }
}
