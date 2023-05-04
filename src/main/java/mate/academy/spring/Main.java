package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setAge(21);
        user1.setName("Bob");
        
        User user2 = new User();
        user2.setAge(34);
        user2.setName("Alice");
        
        AnnotationConfigApplicationContext contex = 
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = contex.getBean(UserService.class);
        
        userService.add(user1);
        userService.add(user2);
        
        System.out.println(userService.getAll());
    }
}
