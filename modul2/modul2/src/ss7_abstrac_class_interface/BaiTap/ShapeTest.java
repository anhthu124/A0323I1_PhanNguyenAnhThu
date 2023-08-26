package ss7_abstrac_class_interface.BaiTap;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape(3.0);
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
