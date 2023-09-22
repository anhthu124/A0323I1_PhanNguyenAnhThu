package ss15.mvc.service.impl;

import btMVC.repository.ITeacherRepository;
import btMVC.repository.impl.TeacherRepository;
import ss15.mvc.model.Student;
import ss15.mvc.model.Teacher;
import ss15.mvc.service.ITeacherService;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private Scanner scanner = new Scanner(System.in);
    private static ITeacherRepository iTeacherRepository = new TeacherRepository() ;


    @Override
    public void addTeacher() {
//        Teacher teacher=inputInfo();
//        iTeacherRepository.add(teacher);
    }

    @Override
    public void displayAllTeacher() {

    }

    @Override
    public void removeTeacher() {

    }

    @Override
    public void FindTeacher() {

    }
    public Teacher inputInfo() {
        Teacher teacher = new Teacher();
        System.out.print("Nhập mã: ");
        teacher.setCode(Integer.parseInt(scanner.nextLine()));
        System.out.print("Nhập tên: ");
        teacher.setName(scanner.nextLine());
        System.out.print("Nhập ngày sinh: ");
        teacher.setDateOfBirth(scanner.nextLine());
        System.out.print("Nhập giới tính: ");
        teacher.setIsMale(scanner.nextLine());
        System.out.print("Nhập số điện thoại: ");
        teacher.setTelephoneNumber(Integer.parseInt(scanner.nextLine()));
        return teacher;
    }
}
