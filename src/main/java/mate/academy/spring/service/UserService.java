package mate.academy.spring.service;

import java.util.List;
import mate.academy.spring.dao.UserDao;
import mate.academy.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User add(User user) {
        return userDao.add(user);
    }

    public List<User> getAll() {
        return userDao.getAll();
    }
}
