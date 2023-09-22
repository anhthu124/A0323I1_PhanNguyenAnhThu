package ss15.mvc.repository;

import ss15.mvc.model.Person;
import ss15.mvc.model.Teacher;

public interface ITeacherRepository extends IRepository<Teacher> {
    void remove(int code);

    int size();

    Person get(int i);
}
