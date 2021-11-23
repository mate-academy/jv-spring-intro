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

        User user1 = new User();
        user1.setName("Bob");
        user1.setAge(22L);
        beanUserService.add(user1);

        User user2 = new User();
        user2.setName("Alice");
        user2.setAge(16L);
        beanUserService.add(user2);

        User user3 = new User();
        user3.setName("John");
        user3.setAge(43L);
        beanUserService.add(user3);

        System.out.println(beanUserService.getAll());

    }
}
