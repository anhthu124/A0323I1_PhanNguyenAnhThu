package ss7_abstrac_class_interface.BaiTap.Refactoring;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        IResizeable[] shapes = new IResizeable[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(3);
        Random random = new Random();

        for (IResizeable shape : shapes) {
            double percent = random.nextInt(100) + 1;
            double originalArea = shape.getArea();
            //Thay đổi kích thước theo phần trăm
            shape.resize(percent);
            double newArea = shape.getArea();
            System.out.println("Original area: " + originalArea);
            System.out.println("Area after change" + newArea);
        }
    }
}
