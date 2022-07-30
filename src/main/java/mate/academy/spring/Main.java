package mate.academy.spring;

import mate.academy.spring.config.AppConfig;
import mate.academy.spring.dao.UserDao;
import mate.academy.spring.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        UserDao userDao = context.getBean(UserDao.class);

        User bob = new User();
        bob.setAge(20);
        bob.setName("Bob");
        System.out.println(userDao.add(bob));
        userDao.getAll().forEach(System.out::println);
    }
}
