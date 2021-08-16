package mate.academy.spring.service.impl;

import mate.academy.spring.dao.UserDao;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import mate.academy.spring.util.HashUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    private final HashUtil hashUtil;

    @Autowired
    public UserServiceImpl(UserDao userDao,HashUtil hashUtil) {
        this.hashUtil = hashUtil;
        this.userDao = userDao;
    }

    @Override
    public User add(User user) {
        user.setSalt(hashUtil.getSalt());
        user.setPassword(hashUtil.hashPassword(user.getPassword(), user.getSalt()));
        return userDao.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return userDao.findByEmail(email).orElseThrow();
    }

    @Override
    public User getById(Long id) {
        return userDao.getById(id).orElseThrow();
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }
}
