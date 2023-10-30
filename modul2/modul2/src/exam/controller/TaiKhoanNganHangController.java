package exam.controller;

import exam.service.imple.TaiKhoanThanhToanService;
import exam.service.imple.TaiKhoanTietKiemService;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaiKhoanNganHangController {
    TaiKhoanThanhToanService taiKhoanThanhToanService = new TaiKhoanThanhToanService();
    TaiKhoanTietKiemService taiKhoanTietKiemService = new TaiKhoanTietKiemService();

    public void menu() throws Exception {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----------------------------------------------------------------");
            System.out.println("Chon chuc nang theo so(de tiep tuc): \n" +
                    "1. Them moi \n" +
                    "2. Xoa \n" +
                    "3. Xem danh sach cac tai khoan ngan hang \n" +
                    "4. Tim kiem \n" +
                    "5. Thoat \n" +
                    "Chon chuc nang: ");

            try {
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        this.choice1();
                        break;
                    case 2:
                        this.choice2();
                        break;
                    case 3:
                        this.choice3();
                        break;
                    case 4:
                        this.choice4();
                        break;
                    case 5:
                        return;
                }
            } catch (InputMismatchException e) {
                System.out.println("chi nhap so ");
                break;
            }
            System.out.println("");
        } while (choice != 4);
    }

    public void choice1() throws Exception {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----------------------------------------------------------------");
            System.out.println("1. Them tai khoan tiet kiem \n" +
                    "2. Them tai khoan thanh toan \n" +
                    "3. Quay lai \n" +
                    "Chon chuc nang: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    taiKhoanTietKiemService.themMoi();
                    break;
                case 2:
                    taiKhoanThanhToanService.themMoi();
                    break;
                case 3:
                    menu();
            }
        } while (choice != 4);
    }

    public void choice2() throws Exception {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----------------------------------------------------------------");
            System.out.println("1. Xoa tai khoan tiet kiem \n" +
                    "2. Xoa tai khoan thanh toan \n" +
                    "3. Quay lai \n" +
                    "Chon chuc nang: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    taiKhoanTietKiemService.xoa();
                    break;
                case 2:
                    taiKhoanThanhToanService.xoa();
                    break;
                case 3:
                    menu();
            }
        } while (choice != 4);
    }

    public void choice3() throws Exception {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----------------------------------------------------------------");
            System.out.println("1. Xem danh sach tai khoan tiet kiem \n" +
                    "2. Xem danh sach tai khoan thanh toan \n" +
                    "3. Quay lai \n" +
                    "Chon chuc nang: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    taiKhoanTietKiemService.xemDanhSach();
                    break;
                case 2:
                    taiKhoanThanhToanService.xemDanhSach();
                    break;
                case 3:
                    menu();
            }
        } while (choice != 4);
    }

    public void choice4() throws Exception {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----------------------------------------------------------------");
            System.out.println("1. Tim kiem tai khoan tiet kiem \n" +
                    "2. Tim kiem tai khoan thanh toan \n" +
                    "3. Quay lai \n" +
                    "Chon chuc nang: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    taiKhoanTietKiemService.timKiem();
                    break;
                case 2:
                    taiKhoanThanhToanService.timKiem();
                    break;
                case 3:
                    menu();
            }
        } while (choice != 4);
    }
}

