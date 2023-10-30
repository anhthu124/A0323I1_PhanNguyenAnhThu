package casestudy.controller;

import casestudy.model.BenhNhan;
import casestudy.service.*;

import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        BenhNhanService benhNhanService=new BenhNhanService();
        do {
            System.out.println("<---------Chương trình quản lý bệnh án---------->");
            System.out.println("Chọn chức năng theo số  " +
                    "\n1. Thêm mới" +
                    "\n2. Xoá" +
                    "\n3. Xem danh sách các bệnh án" +
                    "\n4. Exit" +
                    "\n Enter your choice...");

            int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Display list facility function: ");
                       benhNhanService.add();
                        break;
                    case 2:
                        System.out.println("Add new facility function: ");
                      benhNhanService.displayList();
                        break;
                    case 3:
                        System.out.println("Display list facility maintenance function: ");
                      //  NganHang.displayListMaintenance();
                        break;
                    case 4:
                        return;
                }
            } while (true);
        }


}