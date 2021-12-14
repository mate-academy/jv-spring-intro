package mate.academy.spring.repository;

import java.util.List;
import mate.academy.spring.model.User;

public interface UserRepository {

    void save(User user);

    List<User> findAll();
}
