package mate.academy.spring.dao;

import java.util.List;

public interface AbstractDao<T, P> {
    T add(T user);

    List<T> getAll();
}
