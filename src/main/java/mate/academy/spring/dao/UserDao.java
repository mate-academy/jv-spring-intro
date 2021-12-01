package mate.academy.spring.dao;

import mate.academy.spring.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    List<User> getAll();
}
