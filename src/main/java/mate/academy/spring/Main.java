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

        User user = new User();
        user.setName("Bob");
        user.setAge(35);
        bean.add(user);

        User user3 = new User();
        user3.setName("BobS");
        user3.setAge(35);

        User user2 = new User();
        user2.setName("Alice");
        user2.setAge(35);
        bean.add(user2);
        bean.add(user3);
        bean.getAll().forEach(System.out::println);

    }
}
