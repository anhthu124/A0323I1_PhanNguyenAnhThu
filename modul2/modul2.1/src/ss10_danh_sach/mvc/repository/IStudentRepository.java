package ss10_danh_sach.mvc.repository;

import ss10_danh_sach.mvc.model.Student;

import java.util.List;

public interface IStudentRepository {

    void removeStudent(Student student);

    void addStudent(Student student);

    List<Student> getAll();
}
