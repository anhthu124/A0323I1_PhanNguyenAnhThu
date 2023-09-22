package ss15.mvc.controller;

import ss15.mvc.service.IStudentService;
import ss15.mvc.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static IStudentService iStudentService = new StudentService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        boolean flag=true;
        do {
            System.out.println("1. Thêm mới");
            System.out.println("2. Xoá sinh viên");
            System.out.println("3. Xem danh sách");
            System.out.println("4. Xem thông tin giáo viên");
            System.out.println("5. Tìm kiếm sinh viên");
            System.out.println("6. Thoát ");
            System.out.println(" Chọn chức năng: ");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng");
            }
            switch (choice) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.removeStudent();
                    break;
                case 3:
                    iStudentService.displayAllStudent();
                    break;
                case 4:
                    break;
                case 5:
                    iStudentService.FindStudent();
                default:
                    flag = false;
            }
        }while (flag);

    }
}
