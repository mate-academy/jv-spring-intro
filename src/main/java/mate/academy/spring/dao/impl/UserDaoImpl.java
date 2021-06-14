package mate.academy.spring.dao.impl;

import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import mate.academy.spring.dao.UserDao;
import mate.academy.spring.exception.DataProcessingException;
import mate.academy.spring.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
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
            throw new DataProcessingException("An error occurred while "
                    + "processing query to add new user = " + user, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<User> listUsers() {
        try (Session session = factory.openSession()) {
            CriteriaQuery<User> query =
                    session.getCriteriaBuilder().createQuery(User.class);
            query.from(User.class);
            return session.createQuery(query).getResultList();
        }
    }
}
