package mate.academy.spring.dao;

import java.util.List;
import mate.academy.spring.model.User;

public interface UserDao {
    User add(User user);

    default List<User> getAll() {
        return null;
    }
}
