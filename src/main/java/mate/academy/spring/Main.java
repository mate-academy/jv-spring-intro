package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User firstUser = new User();
        firstUser.setName("Nurik");
        firstUser.setEmail("nurik@intel.com");
        firstUser.setPassword("3564");

        User secondUser = new User();
        secondUser.setName("Artem");
        secondUser.setEmail("asu@izovat.ua");
        secondUser.setPassword("123456");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService service = context.getBean(UserService.class);
        service.add(firstUser);
        service.add(secondUser);
        System.out.println(service.getAll());
    }
}
