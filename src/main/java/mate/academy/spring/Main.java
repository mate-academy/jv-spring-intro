package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User john = new User();
        john.setUserName("John");
        
        User mark = new User();
        mark.setUserName("Mark");
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        
        userService.add(john);
        userService.add(mark);
        
        userService.listUsers().forEach(System.out::println);
    }
}
