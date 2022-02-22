package mate.academy.spring.dao;

import java.util.List;
import mate.academy.spring.models.User;

public interface UserDao {

    User add(User user);

    List<User> getAll();
}
