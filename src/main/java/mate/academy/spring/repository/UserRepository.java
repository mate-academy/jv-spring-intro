package mate.academy.spring.repository;

import java.util.List;
import mate.academy.spring.model.User;

public interface UserRepository {
    User save(User user);

    List<User> getAll();
}
