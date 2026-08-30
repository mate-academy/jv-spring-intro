package mate.academy.spring.services;

import java.util.List;
import mate.academy.spring.model.User;

public interface UserService {
    User add(User user);

    List<User> getAll();
}
