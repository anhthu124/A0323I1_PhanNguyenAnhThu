package ss15.mvc.repository.impl;

import ss15.mvc.model.Person;
import ss15.mvc.model.Student;
import ss15.mvc.repository.IStudentRepository;

import java.util.LinkedList;
import java.util.List;

public class StudentRepository implements IStudentRepository {

    private static final List<Student> students = new LinkedList<>();
//    private List<Integer> ints = new ArrayList<>();

    static {

    }

    @Override
    public void remove(Student student) {
        students.remove(student);
    }

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void remove(int code) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Person get(int i) {
        return null;
    }
}
