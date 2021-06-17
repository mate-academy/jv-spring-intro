package mate.academy.spring.dao;

import java.util.List;
import mate.academy.spring.model.User;

public interface UserDao {
    void save(User user);
    
    List<User> getAll();
}
