package mate.academy.spring.dao;

import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import mate.academy.spring.exception.DataProcessingException;
import mate.academy.spring.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
    public void add(User user) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't insert to DB user: "
                    + user, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<User> getAll() {
        try (Session session = sessionFactory.openSession()) {
            CriteriaQuery<User> criteriaQuery = session.getCriteriaBuilder()
                    .createQuery(User.class);
            criteriaQuery.from(User.class);
            return session.createQuery(criteriaQuery).getResultList();
        } catch (Exception e) {
            throw new DataProcessingException("Can't get all users", e);
        }
    }
}
