package mate.academy.spring;

import mate.academy.spring.config.ApplicationConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext annotation =
            new AnnotationConfigApplicationContext(ApplicationConfig.class);

    public static void main(String[] args) {

        User user = new User();
        user.setAge(19);
        user.setName("Anna");
        User user1 = new User();
        user1.setName("Vanya");
        user1.setAge(27);
        UserService service = annotation.getBean(UserService.class);
        service.add(user);
        service.add(user1);
        System.out.println(service.getAll());
    }
}
