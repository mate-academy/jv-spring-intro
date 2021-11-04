package mate.academy.spring.util;

import javax.naming.Context;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    public static final SessionFactory sessionFactory = initSessionFactory();

    private static SessionFactory initSessionFactory() {
        return new Configuration().configure().buildSessionFactory();

    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
