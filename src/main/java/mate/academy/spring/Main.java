package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService service = applicationContext.getBean(UserService.class);
        service.add(new User("Ivan", 18));
        service.add(new User("Petro", 19));
        service.add(new User("Daniil", 20));
        System.out.println(service.getAll());
    }
}
