package mate.academy.spring.service;

import java.util.List;
import mate.academy.spring.dao.UserDao;
import mate.academy.spring.model.User;
import mate.academy.spring.util.HashUtil;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final HashUtil hashUtil;
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao, HashUtil hashUtil) {
        this.hashUtil = hashUtil;
        this.userDao = userDao;
    }

    @Override
    public User add(User user) {
        user.setSalt(hashUtil.getSalt());
        user.setPassword(hashUtil.hashPassword(user.getPassword(), user.getSalt()));
        return userDao.add(user);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}
