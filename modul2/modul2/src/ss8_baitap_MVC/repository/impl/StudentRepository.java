package ss8_mvc.repository.impl;

import ss8_mvc.model.CompaByClassName;
import ss8_mvc.model.CompaById;
import ss8_mvc.model.Student;
import ss8_mvc.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class StudentRepository implements IStudentRepository {
    private static LinkedList<Student> studentArrayList = new LinkedList<>();
    static {
          studentArrayList.add(new Student(1,"chanh1","C05"));
          studentArrayList.add(new Student(5,"chanh3","C04"));
          studentArrayList.add(new Student(3,"chanh1","C07"));
          studentArrayList.add(new Student(30,"chanh3","C01"));

    }
    @Override
    public LinkedList<Student> getListStudent() {
        // đọc ghi file ở đây hoặc kết nối DB
        // sắp theo tên và id
        Collections.sort(studentArrayList);
        return studentArrayList;
    }

    @Override
    public LinkedList<Student> sortByClassName() {
        // sắp xếp theo class name

        Collections.sort(studentArrayList,new CompaById());
        return studentArrayList;
    }

    @Override
    public void addStudent(Student student) {
       studentArrayList.add(student);
    }

    @Override
    public void deleteStudentById(int id) {
        for (int i = 0; i <studentArrayList.size() ; i++) {
            if (studentArrayList.get(i).getId()==id){
                studentArrayList.remove(i);
                break;
            }
        }

    }
}
