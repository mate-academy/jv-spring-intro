package mate.academy.spring;

import mate.academy.spring.configuration.AppConfiguration;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        User user = new User();
        user.setFirstName("firstName");
        user.setLastName("lastName");
        user.setEmail("email");
        user.setAge(20);
        UserService service = context.getBean(UserService.class);
        service.add(user);
        service.getAll().forEach(System.out::println);
    }
}
