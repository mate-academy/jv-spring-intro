package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.dao.UserDao;
import mate.academy.spring.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        UserDao userDao = context.getBean(UserDao.class);

        User user = new User();
        user.setAge(30);
        user.setName("Username");

        System.out.println(userDao.add(user));

        userDao.getAll().forEach(System.out::println);
    }
}
