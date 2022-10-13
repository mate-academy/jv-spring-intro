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

        User adam = new User();
        adam.setName("Adam");
        adam.setAge(33);
        bean.add(adam);

        User eve = new User();
        eve.setName("Eve");
        eve.setAge(33);
        bean.add(eve);

        System.out.println(bean.getAll());
    }
}
