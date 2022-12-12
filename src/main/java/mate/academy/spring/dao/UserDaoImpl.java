package mate.academy.spring.dao;

import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
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
            session.persist(user);
            transaction.commit();
            return user;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't insert user", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<User> getAll() {
        try (Session session = appConfig.getSessionFactory().getObject().openSession()) {
            HibernateCriteriaBuilder criteriaBuilder
                    = (HibernateCriteriaBuilder) session.getCriteriaBuilder();
            CriteriaQuery<User> query = criteriaBuilder.createQuery(User.class);
            query.from(User.class);
            return session.createQuery(query).getResultList();
        }
    }
}
