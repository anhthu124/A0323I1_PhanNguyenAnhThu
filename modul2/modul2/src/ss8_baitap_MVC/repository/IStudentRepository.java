package ss8_mvc.repository;

import ss8_mvc.model.Student;

import java.util.ArrayList;
import java.util.LinkedList;

public interface IStudentRepository {
    LinkedList<Student> getListStudent();
    LinkedList<Student> sortByClassName();
    void addStudent(Student student);
    void deleteStudentById(int id);
}
