package ss7_abstrac_class_interface.BaiTap.ColorableChoCacLopHinhHoc;


public class Test {
    public static void main(String[] args) {
        Shape[] shapes = {new Squares(7), new Squares(8), new Squares(9)};
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Square " + (i + 1));
            System.out.println("Area " + shapes[i].getArea());
            System.out.println("How to color: " + ((Squares) shapes[i]).howToColor());
        }
    }
}
