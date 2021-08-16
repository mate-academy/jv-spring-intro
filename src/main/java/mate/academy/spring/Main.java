package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService service = context.getBean(UserService.class);

        User bob = new User("Bob", "1236");
        User alice = new User("Alice", "qwer");
        User ben = new User("Ben", "ji89p");

        service.add(bob);
        service.add(alice);
        service.add(ben);
        System.out.println(service.getAll());

    }
}
