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
        UserService service = context.getBean(UserService.class);
        User bob = new User();
        bob.setName("Bob");
        bob.setAge(30);
        service.add(bob);
        List<User> all = service.getAll();
        System.out.println(all.size());
    }
}
