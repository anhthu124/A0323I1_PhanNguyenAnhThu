package baiThi.repository;


import baiThi.model.Student;

public interface IStudentRepository extends IRepository<Student> {
    void add(baiThi.model.Student student);
}
