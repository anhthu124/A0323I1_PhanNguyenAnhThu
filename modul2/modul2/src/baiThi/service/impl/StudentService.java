package baiThi.service.impl;


import baiThi.model.Student;
import baiThi.repository.IStudentRepository;
import baiThi.service.IStudentService;


import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private Scanner scanner= new Scanner(System.in);
    private static IStudentRepository iStudentRepository = new IStudentRepository() {


        @Override
        public void remove(int e) {

        }

        @Override
        public void add(Student student) {
            // Student student = inputInfo();
            iStudentRepository.add(student);
            System.out.println("Thêm mới thành công");
            System.out.println("---------------------------------");
        }




        @Override
        public List<Student> getAll() {
            return null;
        }
    };

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
        for(Student student: studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void removeStudent() {
        System.out.print("Nhập code để xóa: ");
        int code = Integer.parseInt(scanner.nextLine());
        iStudentRepository.remove(code);

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
