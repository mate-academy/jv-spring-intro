package mate.academy.spring.service;

import java.util.List;
import mate.academy.spring.model.User;

public interface GenericService {
    User add(User user);

    List<User> getAll();
}
