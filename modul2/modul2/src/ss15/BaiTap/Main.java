package ss15.BaiTap;

import java.util.Scanner;

public class Main {
    public static void checkTriangleValidity(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Các cạnh phải là số dương.");
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Tổng 2 cạnh phải lớn hơn cạnh còn lại.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhập a: ");
            double a = Double.parseDouble(sc.nextLine());

            System.out.print("Nhập b: ");
            double b = Double.parseDouble(sc.nextLine());

            System.out.print("Nhập c: ");
            double c = Double.parseDouble(sc.nextLine());
            checkTriangleValidity(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
