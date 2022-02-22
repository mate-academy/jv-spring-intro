package mate.academy.spring.service;

import java.util.List;
import mate.academy.spring.models.User;

public interface UserService {

    User add(User user);

    List<User> getAll();
}
