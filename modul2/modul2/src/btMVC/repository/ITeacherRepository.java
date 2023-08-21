package btMVC.repository;

import btMVC.model.Teacher;
import btMVC.repository.IRepository;

public interface ITeacherRepository extends IRepository<Teacher> {
    void add(Teacher teacher);
}
