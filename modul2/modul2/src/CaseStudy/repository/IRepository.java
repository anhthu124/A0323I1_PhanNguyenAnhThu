package casestudy.repository;

import java.util.List;

public interface IRepository<E> {
    void add(E e);
    List<E> getList();
}
