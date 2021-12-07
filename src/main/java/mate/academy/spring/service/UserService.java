package mate.academy.spring.service;

import java.util.List;
import mate.academy.spring.exception.UserNotSavedException;
import mate.academy.spring.model.User;

public interface UserService {
    User add(User user) throws UserNotSavedException;

    List<User> getAll();
}
