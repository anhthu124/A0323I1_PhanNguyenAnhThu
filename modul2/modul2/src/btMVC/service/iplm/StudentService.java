package btMVC.service.iplm;

import btMVC.model.Student;
import btMVC.repository.IRepository;
import btMVC.repository.IStudentRepository;
import btMVC.repository.impl.StudentRepository;
import btMVC.service.IStudentService;


import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
private Scanner scanner=new Scanner(System.in);
    private static IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public void addStudent() {
        Student student=inputInfo();
        iStudentRepository.add(student);
        System.out.println(" Thêm mới thành công");
        System.out.println("----------------------");
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập code để xóa: ");
        int code = Integer.parseInt(scanner.nextLine());
        iStudentRepository.remove(code);

    }

    @Override
    public void updateStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập code student cần chỉnh sửa :");
        int searchId = Integer.parseInt(sc.nextLine());
        if (iStudentRepository.updateStudentById(searchId) == true) {
            System.out.println(" Nhập id: ");
            int code =Integer.parseInt(scanner.nextLine());
            System.out.println(" Nhập tên: ");
            String name =sc.nextLine();
            System.out.println(" Nhập ngày sinh: ");
            String dOB =sc.nextLine();
            System.out.println(" Nhập điểm: ");
            int diem =Integer.parseInt(scanner.nextLine());
            Student student=new Student(code,name,dOB,diem);
           iStudentRepository.updateStudentById(searchId,student);
        }if(iStudentRepository.searchStudentById(searchId)==false){
            System.out.println(" Không tìm thấy id cần sửa");
        }
    }

    @Override
    public void findStudent() {

    }


    private Student inputInfo() {
        Student student = new Student();
        System.out.print("Nhập mã: ");
        student.setCode(Integer.parseInt(scanner.nextLine()));
        System.out.print("Nhập tên: ");
        student.setName(scanner.nextLine());
        System.out.print("Nhập ngày sinh: ");
        student.setDateOfBirth(scanner.nextLine());
        System.out.print("Nhập điểm: ");
        student.setGrade(Double.parseDouble(scanner.nextLine()));
        return student;
    }
}
