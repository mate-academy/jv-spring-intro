package mate.academy.spring.dao;

import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    private final AppConfig appConfig;

    @Autowired
    public UserDaoImpl(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

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
            throw new RuntimeException("Can't save the user", e.getCause());
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<User> getAll() {
        try (Session session = appConfig.getSessionFactory().getObject().openSession()) {
            CriteriaQuery<User> criteriaQuery = session.getCriteriaBuilder()
                    .createQuery(User.class);
            criteriaQuery.from(User.class);
            return session.createQuery(criteriaQuery).getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Can't get the list of users", e);
        }
    }
}
