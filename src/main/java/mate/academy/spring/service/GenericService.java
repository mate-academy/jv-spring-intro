package mate.academy.spring.service;

import java.util.List;

public interface GenericService<T, P> {
    T add(T user);

    List<T> getAll();
}
