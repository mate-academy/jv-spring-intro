package mate.academy.spring.service;

import java.util.List;
import mate.academy.spring.dao.UserDao;
import mate.academy.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("testUserDaoImpl")
    private UserDao someUserDao;

    @Override
    public void add(User user) {
        someUserDao.add(user);
    }

    @Override
    public List<User> getAll() {
        return someUserDao.getAll();
    }
}
