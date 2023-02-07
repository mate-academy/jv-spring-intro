package mate.academy.spring.dao.impl;

import java.util.List;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.dao.UserDao;
import mate.academy.spring.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private AppConfig appConfig;

    @Override
    public User add(User user) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = appConfig.getSessionFactory().getObject().openSession();
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
            return user;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't insert user: " + user, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<User> getAll() {
        try (Session session = appConfig.getSessionFactory().getObject().openSession()) {
            Query<User> getAllUsersQuery = session.createQuery("from User", User.class);
            return getAllUsersQuery.getResultList();
        }
    }
}
