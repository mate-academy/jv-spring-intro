package mate.academy.spring.dao.impl;

import java.util.List;
import mate.academy.spring.dao.UserDao;
import mate.academy.spring.model.User;
import mate.academy.spring.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDaoImpl implements UserDao {
    @Override
    public void add(User user) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<User> getAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM User u", User.class).list();
        } catch (Exception e) {
            throw new RuntimeException("", e);
        }
    }
}
