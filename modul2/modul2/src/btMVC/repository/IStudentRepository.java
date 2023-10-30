package btMVC.repository;

import btMVC.model.Student;

public interface IStudentRepository extends IRepository<Student> {

    void remove(int e);

    void add(Student student);

    void updateStudentById(int id, Student student);

    void searchStudentByName(String name);

    boolean searchStudentById(int id);

   // boolean updateStudentById(int searchId);

     boolean updateStudentById(int id);
    // void updateStudentById(int code);
}
