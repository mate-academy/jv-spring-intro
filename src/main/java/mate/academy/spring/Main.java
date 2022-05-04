package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User anton = new User();
        anton.setAge(18);
        anton.setName("Anton");
        User maria = new User();
        maria.setAge(21);
        maria.setName("Maria");
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userBean = applicationContext.getBean(UserService.class);
        userBean.add(anton);
        userBean.add(maria);
        System.out.println(userBean.getAll());
    }
}
