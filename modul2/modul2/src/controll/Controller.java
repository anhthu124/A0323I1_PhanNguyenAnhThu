package controll;

import a.service.DanhBaService;


import java.util.Scanner;

public class Controller {
    private static DanhBaService danhbaservice=new DanhBaService();
    private static Scanner scanner=new Scanner(System.in);
   // private static Scanner scanner;

    public static void disPlayMenu() {
        while (true) {

            System.out.println("======Chuong trinh quan ly danh ba========");
            System.out.println("Chon chuc nang theo so(de tiep tuc):");
            System.out.println("1.Xem danh sach");
            System.out.println("2.Them moi");
            System.out.println("3.Cap nhat");
            System.out.println("4.Xoa");
            System.out.println("5.Tim kiem");
            System.out.println("6.Doc tu file");
            System.out.println("7.Ghi vao file");
            System.out.println("8.Thoat");
            System.out.print("Chon chuc nang:");

            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng");
            }


            switch (choice) {
                case 1:
                    danhbaservice.disPlay();
                    break;
                case 2:
                    danhbaservice.addNew();
                    break;
                case 3:
                    danhbaservice.Edit();
                    break;
                case 4:
                    danhbaservice.Remove();
                    break;
                case 5:
                    danhbaservice.Find();
                    break;
                case 6:
                    danhbaservice.ReadFromFile();
                    break;
                case 7:
                    danhbaservice.WritetoFile();
                    break;
                case 8:
                    System.out.println("Thank you");
                    return;
            }
        }
    }


}
