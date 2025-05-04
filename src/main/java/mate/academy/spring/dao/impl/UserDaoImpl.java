package mate.academy.spring.dao.impl;

import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import mate.academy.spring.dao.UserDao;
import mate.academy.spring.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private LocalSessionFactoryBean localSessionFactoryBean;

    @Override
    public User add(User user) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = localSessionFactoryBean.getObject().openSession();
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
            return user;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't insert a user: " + user, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<User> getAll() {
        try (Session session = localSessionFactoryBean.getObject().openSession()) {
            CriteriaQuery<User> criteriaQuery = session.getCriteriaBuilder()
                    .createQuery(User.class);
            criteriaQuery.from(User.class);
            return session.createQuery(criteriaQuery).getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Can't get all users", e);
        }
    }
}
