package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService beanUserService = context.getBean(UserService.class);

        User userBob = new User();
        userBob.setName("Bob");
        userBob.setAge(22L);
        beanUserService.add(userBob);

        User userAlice = new User();
        userAlice.setName("Alice");
        userAlice.setAge(16L);
        beanUserService.add(userAlice);

        User userJohn = new User();
        userJohn.setName("John");
        userJohn.setAge(43L);
        beanUserService.add(userJohn);

        System.out.println(beanUserService.getAll());

    }
}
