package mate.academy.spring.repository;

import java.util.List;
import mate.academy.spring.exception.DataProcessingException;
import mate.academy.spring.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    private final SessionFactory sessionFactory;

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public User add(User user) {
        Session session = null;
        Transaction transaction = null;

        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.persist(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }

            throw new DataProcessingException("Can't save user: " + user);
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return user;
    }

    @Override
    public List<User> getAll() {
        String query = "from User";

        try (Session session = sessionFactory.openSession()) {
            Query<User> queryFromUsers = session.createQuery(query, User.class);
            return queryFromUsers.getResultList();
        } catch (Exception e) {
            throw new DataProcessingException("Can't get all users from DB");
        }
    }
}
