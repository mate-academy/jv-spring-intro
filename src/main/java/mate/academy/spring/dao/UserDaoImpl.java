package mate.academy.spring.dao;

import java.util.List;
import mate.academy.spring.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public User add(User user) {
        return user;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
