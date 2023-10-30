package baiThi.repository;

import baiThi.model.Student;

import java.util.List;

public interface IRepository<E> {
    void remove(int e);

    void add(E e);

    List<Student> getAll();
}
