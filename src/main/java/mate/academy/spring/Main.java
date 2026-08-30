package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User nezuka = new User();
        nezuka.setName("Nezuka");
        nezuka.setAge(16);

        User yui = new User();
        yui.setName("Yui");
        yui.setAge(18);

        User suzuki = new User();
        suzuki.setName("Suzuki");
        suzuki.setAge(22);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(nezuka);
        userService.add(yui);
        userService.add(suzuki);
        System.out.println(userService.getAll());
    }
}
