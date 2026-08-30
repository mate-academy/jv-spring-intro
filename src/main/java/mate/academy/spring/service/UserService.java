package mate.academy.spring.service;

import java.util.List;
import mate.academy.spring.model.User;

public interface UserService {
    List<User> getAll();

    User add(User user);
}
