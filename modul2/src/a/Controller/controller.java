package a.Controller;

import a.service.DanhBaService;
import controll.Controller;

import java.util.Scanner;

public class controler {
    DanhBaService danhbaservice=new DanhBaService();
    Scanner nhap=new Scanner(System.in);
    public void disPlayMenu() {
        int choose;
        do {
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
            choose = nhap.nextInt();
            switch (choose) {
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
        }while (choose != 8) ;
    }

    public static void main(String[] args) {
        Controller controller=new Controller();
        controller.disPlayMenu();
    }
}
