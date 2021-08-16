package mate.academy.spring.service.impl;

import java.util.List;
import mate.academy.spring.dao.UserDao;
import mate.academy.spring.dao.impl.UserDaoImpl;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import mate.academy.spring.util.HashUtil;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public void add(User user) {
        user.setSalt(HashUtil.getSalt());
        user.setPassword(HashUtil.hashPassword(user.getPassword(), user.getSalt()));
        userDao.add(user);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}
