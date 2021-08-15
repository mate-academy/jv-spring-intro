package mate.academy.spring.dao;

import java.util.Optional;
import mate.academy.spring.model.User;

public interface UserDao {
    User save(User user);

    Optional<User> getById(Long id);

    User update(User user);

    void delete(User user);

    Optional<User> findByEmail(String email);
}
