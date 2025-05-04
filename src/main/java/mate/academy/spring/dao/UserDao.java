package mate.academy.spring.dao;

import java.util.List;
import mate.academy.spring.model.User;

public interface UserDao extends GenericDao {
    @Override
    User add(User user);

    @Override
    List<User> getAll();
}
