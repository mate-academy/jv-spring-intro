package mate.academy.spring.service;

import java.util.List;
import mate.academy.spring.model.User;
import mate.academy.spring.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void add(User user) {
        userRepo.add(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.getAllUsers();
    }
}
