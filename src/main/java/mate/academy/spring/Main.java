package mate.academy.spring;

import mate.academy.spring.config.ApplicationConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(ApplicationConfig.class);

    public static void main(String[] args) {
        User bob = new User();
        bob.setUsername("Bob");
        bob.setCountry("USA");
        User alice = new User();
        alice.setUsername("Alice");
        alice.setCountry("Canada");

        UserService userDao = context.getBean(UserService.class);
        userDao.add(alice);
        userDao.add(bob);
        userDao.listUsers().forEach(System.out::println);
        //context.close();
    }
}
