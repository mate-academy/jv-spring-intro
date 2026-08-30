package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User john = new User();
        john.setAge(Integer.valueOf(18));
        john.setName("John");
        User anna = new User();
        anna.setAge(Integer.valueOf(20));
        anna.setName("Anna");
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(john);
        userService.add(anna);
        System.out.println(userService.getAll());
    }
}
