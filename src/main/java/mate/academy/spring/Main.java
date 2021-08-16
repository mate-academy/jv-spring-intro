package mate.academy.spring;

import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import mate.academy.spring.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        User bob = new User();
        bob.setEmail("bobmarley@gmail.com");
        bob.setPassword("123654");

        UserService userService = new UserServiceImpl();
        userService.add(bob);
        System.out.println(userService.getAll());
    }
}
