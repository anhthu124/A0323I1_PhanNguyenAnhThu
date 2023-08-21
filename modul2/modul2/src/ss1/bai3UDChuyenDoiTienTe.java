package ss1;

import java.util.Scanner;

public class bai3UDChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhap so tien can chuyen doi: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println(" Gia tri vnd: " + quydoi);
    }
}
