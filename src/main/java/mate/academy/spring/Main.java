package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User bob = new User();
        bob.setName("Bob");
        bob.setAge(10);
        User alisa = new User();
        alisa.setName("Alisa");
        alisa.setAge(20);
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService service = context.getBean(UserService.class);
        service.add(bob);
        service.add(alisa);
        System.out.println(service.getAll());
    }
}
