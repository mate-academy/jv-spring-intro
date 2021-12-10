package mate.academy.spring.service;

import java.util.List;
import mate.academy.spring.dao.UserDao;
import mate.academy.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao someUserDao;

    @Autowired
    public UserServiceImpl(UserDao someUserDao) {
        this.someUserDao = someUserDao;
    }

    @Override
    public void add(User user) {
        someUserDao.add(user);
    }

    @Override
    public List<User> getAll() {
        return someUserDao.getAll();
    }
}
