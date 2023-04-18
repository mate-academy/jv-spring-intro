package mate.academy.spring.service;

import java.util.List;
import mate.academy.spring.model.User;

public interface UserService extends GenericService {
    @Override
    User add(User user);

    @Override
    List<User> getAll();
}
