package ss4_lop_va_doi_tuong.BT.Bai1XayDungLopQuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {

    double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta;
        return delta = 2 * b - 4 * a * c;
    }

    public double getRoot1() {
        double r1 = (-b + Math.sqrt(getDiscriminant())) / 2 * a;
        return r1;
    }

    public double getRoot2() {
        double r2 = (-b - Math.sqrt(getDiscriminant())) / 2 * a;
        return r2;
    }

    public void solveEquation() {
        if (getDiscriminant() > 0) {
            System.out.println("Nghiệm 1:" + getRoot1());
            System.out.println("Nghiệm 2:" + getRoot2());
        } else if (getDiscriminant() == 0) {
            System.out.println("Nghiệm kép:" + getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị a:");
        double a = sc.nextDouble();
        System.out.println("Nhập giá trị b:");
        double b = sc.nextDouble();
        System.out.println("Nhập giá trị c:");
        double c = sc.nextDouble();
        QuadraticEquation result = new QuadraticEquation(a, b, c);
        result.solveEquation();
    }
}


