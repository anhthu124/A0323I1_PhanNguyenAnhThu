package ss3MangVaPhuongThuc.BT;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    Scanner scanner = new Scanner(System.in);

    void deleteArray(int[] array) {
        int[] newArr = new int[array.length - 1];
        System.out.println("\n Nhập vị trí bạn muốn thêm : ");
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                count = 1;
                for (int j = 0; j < i; j++) {
                    newArr[j] = array[j];
                }
                for (int j = i + 1; j < array.length; j++) {
                    newArr[j - 1] = array[j];
                }
            }
        }

    }
}
