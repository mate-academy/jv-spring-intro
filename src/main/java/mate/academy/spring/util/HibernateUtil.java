package mate.academy.spring.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = initSesSionFactory();

    private static SessionFactory initSesSionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            throw new RuntimeException("Can't create a session factory!", e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
