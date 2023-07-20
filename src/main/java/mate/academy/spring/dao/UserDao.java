package mate.academy.spring.dao;

import java.util.List;
import mate.academy.spring.model.User;

public interface UserDao {
    public User add(User user);

    List<User> getAll();
}
