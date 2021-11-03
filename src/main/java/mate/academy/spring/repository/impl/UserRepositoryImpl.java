package mate.academy.spring.repository.impl;

import java.util.List;
import mate.academy.spring.model.User;
import mate.academy.spring.repository.UserRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private final SessionFactory sessionFactory;

    @Autowired
    public UserRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public User save(User user) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
            return user;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't insert user to DB:" + user, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<User> getAll() {
        try (Session session = sessionFactory.openSession()) {
            return session
                    .createQuery("FROM User", User.class)
                    .getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Can't get list of all users", e);
        }
    }
}
