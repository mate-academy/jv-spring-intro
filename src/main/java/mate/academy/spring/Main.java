package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService bean = context.getBean(UserService.class);
        bean.add(new User(33, "Jesus Christ"));
        bean.add(new User(28, "Alice"));
        System.out.println(bean.getAll());
    }
}
