package mate.academy.spring;

import mate.academy.spring.context.ApplicationContext;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationContext.class);
        UserService userService = context.getBean(UserService.class);
        User user1 = new User();
        user1.setAge(21);
        user1.setName("Bohdan");
        userService.add(user1);
        System.out.println(userService.getAll());
    }
}
