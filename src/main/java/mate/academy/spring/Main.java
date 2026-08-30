package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User max = new User("Max", 30);
        User valeriia = new User("Valeriia", 28);
        User danyil = new User("Danyil", 4);

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService service = context.getBean(UserService.class);
        service.add(max);
        service.add(valeriia);
        service.add(danyil);

        System.out.println(service.getAll());
    }
}
