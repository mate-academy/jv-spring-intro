package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User bob = new User();
        bob.setName("bodia");
        bob.setSex("man");
        User alice = new User();
        alice.setName("alice");
        alice.setSex("woman");

        UserService bean = context.getBean(UserService.class);
        bean.add(bob);
        bean.add(alice);
        bean.getAll().forEach(System.out::println);
    }
}
