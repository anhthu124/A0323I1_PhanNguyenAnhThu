package baiMau.Controller;

import java.util.Scanner;

public class Controller {
  public static void displayMenu(){
//        IStudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        boolean flag=true;
        do {
            System.out.println("Chọn chức năng :");
            System.out.println("1.Thêm mới" +
                    "\n 2.Xoá" +
                    "\n 3.Xem danh sách các bệnh án" +
                    "\n 4.Thoát"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Thêm mới");
                    //studentService.display();
                    break;
                case 2:
                    System.out.println("Xoá");
                   // studentService.add();
                    break;
                case 3:
                    System.out.println("Xem danh sách các bệnh án");
                   // studentService.edit();
                    break;
                default:
                    flag = false;
            }
        }while (flag);

   }
}
