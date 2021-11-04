package mate.academy.spring.dao.impl;

import exception.DataProcessingException;
import java.util.List;
import mate.academy.spring.dao.UserDao;
import mate.academy.spring.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {
    private final SessionFactory factory;

    @Autowired
    public UserDaoImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void add(User user) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't add user to DB with param "
                    + user + ". ", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<User> getAll() {
        String query = "FROM User";
        try (Session session = factory.openSession()) {
            return session.createQuery(query).list();
        } catch (Exception e) {
            throw new DataProcessingException("Can't gat all users form DB", e);
        }
    }
}
