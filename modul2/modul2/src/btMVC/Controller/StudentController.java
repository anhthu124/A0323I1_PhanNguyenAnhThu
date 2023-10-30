package btMVC.Controller;

import btMVC.service.IStudentService;
import btMVC.service.iplm.StudentService;

import java.util.Scanner;

public class StudentController {
    private static IStudentService iStudentService = new StudentService();
    private static Scanner scanner = new Scanner(System.in);


    public static void menu() {
        boolean flag = true;
        do {
            System.out.println("1. Thêm mới");
            System.out.println("2. Chỉnh sửa");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Xóa");
            System.out.println("5. Thoát ");
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
                    iStudentService.updateStudent();
                    break;
                case 3:
                    iStudentService.displayAllStudent();
                    break;
                case 4:
                    iStudentService.removeStudent();
                    break;
                default:
                    flag = false;
            }
        } while (flag);

    }
}