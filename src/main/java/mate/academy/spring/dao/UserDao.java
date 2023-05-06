package mate.academy.spring.dao;

import java.util.List;
import mate.academy.spring.exception.DataProcessingException;
import mate.academy.spring.model.User;

public interface UserDao {
    User add(User user);

    List<User> getAll() throws DataProcessingException;
}
