package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService bean = context.getBean(UserService.class);

        User bob = new User();
        bob.setName("Bob");
        bob.setAge(35);
        bean.add(bob);

        User alice = new User();
        alice.setName("Alice");
        alice.setAge(35);
        bean.add(alice);

        bean.getAll().forEach(System.out::println);
    }
}
