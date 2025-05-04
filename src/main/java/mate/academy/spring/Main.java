package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Vasyl");
        user.setAge(24);

        User user2 = new User();
        user2.setName("Ivan");
        user2.setAge(29);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService bean = context.getBean(UserService.class);
        bean.add(user);
        bean.add(user2);

        System.out.println(bean.getAll());
    }
}
