package mate.academy.spring.repo;

import java.util.List;
import mate.academy.spring.model.User;

public interface UserRepo {
    void add(User user);

    List<User> listUsers();
}
