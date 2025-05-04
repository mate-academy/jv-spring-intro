package mate.academy.spring.service;

import java.util.List;
import mate.academy.spring.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User add(User user);

    List<User> getAll();
}
