package mate.academy.spring.dao;

import java.util.List;
import mate.academy.spring.exception.UserNotSavedException;
import mate.academy.spring.model.User;

public interface UserDao {
    User save(User user) throws UserNotSavedException;

    List<User> getAll();
}
