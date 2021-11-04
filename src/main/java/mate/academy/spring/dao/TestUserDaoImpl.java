package mate.academy.spring.dao;

import java.util.List;
import mate.academy.spring.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class TestUserDaoImpl implements UserDao {

    @Override
    public void add(User user) {
        System.out.println("test Dao, do nothing");
    }

    @Override
    public List<User> getAll() {
        User testUser = new User();
        return List.of(testUser);
    }
}
