package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        User userA = new User();
        userA.setEmail("A@i.ua");
        userA.setPassword("aaaaa");
        User userB = new User();
        userB.setEmail("B@i.ua");
        userB.setPassword("bbbb");
        UserService bean = context.getBean(UserService.class);
        bean.add(userA);
        bean.add(userB);
        bean.getAll().forEach(System.out::println);
    }
}
