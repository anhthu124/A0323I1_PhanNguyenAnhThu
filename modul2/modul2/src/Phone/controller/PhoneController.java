package Phone.controller;

import Phone.service.PhoneChinhHangService;
import Phone.service.PhoneXachTayService;

import java.util.Scanner;

public class PhoneController {
    public static Scanner scanner = new Scanner(System.in);
    public static PhoneChinhHangService phoneChinhHangService = new PhoneChinhHangService();
    public static PhoneXachTayService phoneXachTayService = new PhoneXachTayService();
    public static void displayMenu() {
        boolean flag = true;
        do {
            try {
                System.out.println("---Chương trình quản lý điện thoại---");
                System.out.println("1.Điện thoại chính hãng ");
                System.out.println("2.Điện thoại xách tay  ");
                System.out.println("---------------------");
                System.out.println("Mời chọn chức năng (1 hoặc 2): ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose){
                    case 1:
                        PhoneChinhHang();
                        break;
                    case 2:
                        PhoneXachTay();
                        break;
                    case 3:
                        flag = false;
                }
            }catch (NumberFormatException e){
                System.out.println("Nhận không đúng định dạng !");
                System.out.println("Chỉ được chọn 1 hoắc 2 !");
            }
        } while (flag);
    }

    public static void PhoneChinhHang(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            try {
                System.out.println("---Menu điện thoại chính hãng ---");
                System.out.println("1.Thêm mới ");
                System.out.println("2.Hiển thị danh sách");
                System.out.println("3.Xóa ");
                System.out.println("4.Tìm kiếm ");
                System.out.println("5.Chỉnh sữa ");
                System.out.println("6.Thoát ");
                System.out.println("----------------");

                System.out.println("Mời bạn chọn chức năng (1 -> 6 ): ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose){
                    case 1:
                        phoneChinhHangService.them();
                        break;
                    case 2:
                        phoneChinhHangService.hienThi();
                        break;
                    case 3:
                        phoneChinhHangService.xoa();
                        break;
                    case 4:
                        phoneChinhHangService.timKiem();
                        break;
                    case 5:
                        phoneChinhHangService.chinhSua();
                        break;
                    case 6:
                        flag = false;
                }
            }catch (NumberFormatException e){
                System.out.println("Nhập không đúng định dạng !");
                System.out.println("Chỉ được chọn 1 đến 6 !");
            }
        } while (flag);
    }

    public static void PhoneXachTay(){
        boolean flag = true;
        do {
            try{
                System.out.println("---Menu Điện Thoại Xach Tay --- ");
                System.out.println("1.Thêm mới ");
                System.out.println("2.Hiển thị danh sách");
                System.out.println("3.Xóa ");
                System.out.println("4.Tìm kiếm ");
                System.out.println("5.Chỉnh sữa ");
                System.out.println("6.Thoát ");
                System.out.println("----------------");

                System.out.println("Mời bạn chọn chức năng (1 -> 6 ): ");
                int choose = Integer.parseInt(scanner.nextLine());

                switch (choose){
                    case 1:
                        phoneXachTayService.them();
                        break;
                    case 2:
                        phoneXachTayService.hienThi();
                        break;
                    case 3:
                        phoneXachTayService.xoa();
                        break;
                    case 4:
                        phoneXachTayService.timKiem();
                        break;
                    case 5:
                        phoneXachTayService.chinhSua();
                        break;
                    case 6:
                        break;
                }
            } catch (NumberFormatException e){
                System.out.println("Nhập không đúng định dạng !");
                System.out.println("Chỉ được chọn 1 đến 6 !");
            }
        } while (flag);
    }
}
