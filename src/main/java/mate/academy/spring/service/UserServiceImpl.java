package mate.academy.spring.service;

import java.util.List;
import mate.academy.spring.dao.UserDao;
import mate.academy.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private final UserDao userDao;

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}
