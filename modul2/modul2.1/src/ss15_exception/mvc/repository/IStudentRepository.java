package ss15.mvc.repository;

import ss15.mvc.model.Person;
import ss15.mvc.model.Student;

public interface IStudentRepository extends IRepository<Student> {


    void remove(int code);

    int size();

    Person get(int i);
}
