package ss4LopVaDoiTuong.BT;

public class Bai1XayDungLopQuadraticEquation {
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
            return delta=2*b-4*a*c;
        }
    }

}
