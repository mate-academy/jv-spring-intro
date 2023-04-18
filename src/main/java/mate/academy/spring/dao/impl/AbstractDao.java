package mate.academy.spring.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AbstractDao {
    protected final SessionFactory factory;

    @Autowired
    public AbstractDao(SessionFactory factory) {
        this.factory = factory;
    }
}
