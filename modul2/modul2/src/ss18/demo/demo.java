package ss18.demo;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
//        String a="AnhThu";
//        String b=new String("AnhThu");
//        System.out.println(a==b);
//        System.out.println(a.equals(b));
//        StringBuilder stringBuilder=new StringBuilder("anhthu");
//        stringBuilder.append("phannguyen");
//        System.out.println(stringBuilder);

        Scanner scanner = new Scanner(System.in);
        boolean isFlag;
        String a = "";
        do {
            System.out.println(" Mời nhập:");
            a = scanner.nextLine();
            isFlag = a.matches("^[0-9]{2}\\/((0[1-9])|(1[0-2]))\\/[0-9]{4}$");

        } while (!isFlag);

    }
}
