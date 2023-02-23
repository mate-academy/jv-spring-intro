package mate.academy.spring.dao;

import java.util.List;
import mate.academy.spring.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User add(User user);

    List<User> getAll();
}
