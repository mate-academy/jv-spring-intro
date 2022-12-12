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
        User ivan = new User();
        ivan.setAge(18);
        ivan.setName("Ivan");
        userService.add(ivan);
        User oleh = new User();
        oleh.setAge(38);
        oleh.setName("Oleh");
        userService.add(oleh);
        System.out.println(userService.getAll());
    }
}
