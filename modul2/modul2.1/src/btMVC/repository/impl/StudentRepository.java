package btMVC.repository.impl;

import btMVC.Common.ReadWriteFile;
import btMVC.model.Student;
import btMVC.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    public static final String SRC_STUDENT = "D:\\Skill\\codegym\\model\\modul2\\modul2\\src\\btMVC\\data\\student.csv";
    private int student;
    List<Student> students = getAll();
    private static Student[] studentsSearchs = new Student[10];

    @Override
    public void remove(int code) {
        for (Student student : students) {
            if (student.getCode() == code) {
                System.out.println("Bạn có muốn xóa student có code là: " + code);
                System.out.println("1. Đồng ý");
                System.out.println("2. Hủy bỏ");
                int choice = Integer.parseInt(new Scanner(System.in).nextLine());
                if (choice == 1) {
                    students.remove(student);
                    String str = "";
                    for (Student temp : students) {
                        str += convertToString(temp) + "\n";
                    }
                    ReadWriteFile.writeFile(SRC_STUDENT, str, false);
                    System.out.println("Xóa thành công");
                }
                break;
            }
        }
    }

    @Override
    public void add(Student student) {

        ReadWriteFile.writeFile(SRC_STUDENT, convertToString(student), true);
    }

    @Override
    public void updateStudentById(int id, Student student) {
        List<Student> students = getAll();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCode() == id) {
                students.remove(i);
                students.add(student);
                break;
            }
        }
    }

    @Override
    public void searchStudentByName(String name) {
        int num = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) != null && students.get(i).getName() != null) {
                if (students.get(i).getName().equals(name)) {
                    System.out.println(" tìm thấy ");
                    num = 1;
                    studentsSearchs[i] = students.get(i);
                    break;
                }
            } else {
                System.out.println(" không tìm thấy");
                break;
            }
        }
        if (num == 1) {
            for (int i = 0; i < studentsSearchs.length; i++) {
                if (studentsSearchs[i] != null) {
                    System.out.println(studentsSearchs[i]);
                }
            }
        }
    }

    @Override
    public boolean searchStudentById(int id) {
        boolean a = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) != null) {
                if (students.get(i).getCode() == id) {
                    a = true;
                    break;
                }

            }

        }
        return a;
    }



    @Override
    public boolean updateStudentById(int id) {
        List<Student> students = getAll();
        boolean a = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) != null) {
                if (students.get(i).getCode() == id) {
                    a = true;
                    break;
                }

            }

        } return a;
    }
//    @Override
//    public void updateStudentById(int code, Student student) {
//        //List<Student> students = getAll();
//        for (int i = 0; i < students.size(); i++) {
//            if (students.get(i).getCode() == code) {
//                students.remove(i);
//                students.add(student);
//                break;
//            }
//        }


    @Override
    public List<Student> getAll() {

        List<Student> students = new ArrayList<>();
        List<String> strings = ReadWriteFile.readFile(SRC_STUDENT);
        String[] temp;
        for (String str : strings) {
            if (!str.equals("")) {
                temp = str.split(",");
                students.add(new Student(Integer.parseInt(temp[0]), temp[1], temp[2], Double.parseDouble(temp[3])));
            } else {
                System.out.println(" Danh sách rỗng");
            }
        }
        return students;
    }

    private String convertToString(Student student) {
        return student.getCode() + "," + student.getName() + "," + student.getDateOfBirth() + "," + student.getGrade();
    }
}
