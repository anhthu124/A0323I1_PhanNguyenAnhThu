package ss5.BT.LopChiGhiTrongJava;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("The name before change is: " + student.getName());
        System.out.println("The classes before change is: " + student.getClasses());
        student.setClasses("A0323i1");
        student.setName("Anh Thu");
        System.out.println("The name after change is: " + student.getClasses());
        System.out.println("The classes after change is: " + student.getName());

    }
}