package mate.academy.spring.dao;

import java.util.List;
import mate.academy.spring.model.User;
import mate.academy.spring.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add(User user) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            transaction.commit();
            session.save(user);
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can`t add user: " + user + " to Db",e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<User> getAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
           return session.createQuery("from User", User.class)
                    .getResultList();
        }
    }
}
