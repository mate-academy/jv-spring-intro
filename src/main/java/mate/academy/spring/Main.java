package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
            AppConfig.class);
    
    public static void main(String[] args) {
        User ben = new User();
        ben.setEmail("ben@gmail.com");
        ben.setPassword("123456");
        
        User alex = new User();
        alex.setEmail("alex@gmail.com");
        alex.setPassword("654321");
        
        UserService userService = context.getBean(UserService.class);
        userService.add(ben);
        userService.add(alex);
        for (User user : userService.listUsers()) {
            System.out.println(user);
        }
    }
}
