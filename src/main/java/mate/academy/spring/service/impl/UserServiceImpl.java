package mate.academy.spring.service.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import mate.academy.spring.dao.UserDao;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User add(User user) {
        user.setSalt(getSalt());
        user.setPassword(hashPassword(user.getSalt(), user.getPassword()));
        return userDao.add(user);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    private String hashPassword(byte[] salt, String password) {
        StringBuilder hashedPassword = new StringBuilder();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(salt);
            byte[] symbols = messageDigest.digest(password.getBytes());
            for (byte symbol : symbols) {
                hashedPassword.append(String.format("%02x", symbol));
            }
            return hashedPassword.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Can't hash password!", e);
        }
    }

    private byte[] getSalt() {
        byte[] salt = new byte[16];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(salt);
        return salt;
    }
}
