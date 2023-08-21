package ss16.mvc.demo.repository;

import java.util.List;

public interface IRepository<E> {
    void remove(int e);

    void add(E e);

    List<E> getAll();
}
