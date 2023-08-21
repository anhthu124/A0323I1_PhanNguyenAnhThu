package ss15.mvc.service.impl;


import ss15.mvc.model.Student;
import ss15.mvc.repository.IStudentRepository;
import ss15.mvc.repository.impl.StudentRepository;
import ss15.mvc.service.IStudentService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private Scanner scanner = new Scanner(System.in);
    private static IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public void addStudent() {
        Student student = inputInfo();
        iStudentRepository.add(student);
        System.out.println("Thêm mới thành công");
        System.out.println("---------------------------------");
    }

    @Override
    public void displayAllStudent() {
        List<Student> studentList = iStudentRepository.getAll();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void removeStudent() {
        System.out.print("Nhập code để xóa: ");
        int code = Integer.parseInt(scanner.nextLine());
        iStudentRepository.remove(code);
    }

    @Override
    public void Find() {

    }

    public Student inputInfo() {
        Student student = new Student();
        System.out.print("Nhập mã: ");
        student.setCode(Integer.parseInt(scanner.nextLine()));
        System.out.print("Nhập tên: ");
        student.setName(scanner.nextLine());
        System.out.print("Nhập ngày sinh: ");
        student.setDateOfBirth(scanner.nextLine());
        System.out.print("Nhập giới tính: ");
        student.setIsMale(scanner.nextLine());
        student.setIsMale(scanner.nextLine());
        System.out.print("Nhập số điện thoại: ");
        student.setTelephoneNumber(Integer.parseInt(scanner.nextLine()));
        System.out.print("Nhập mã lớp học: ");
        student.setCodeClass(Integer.parseInt(scanner.nextLine()));

        return student;
    }
}
