package ss3MangVaPhuongThuc.BT;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    Scanner scanner = new Scanner(System.in);

    void deleteArray(int[] array) {
        int[] newArr = new int[array.length - 1];
        System.out.println("\n Nhập phần tử bạn muốn xóa: ");
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
        if (count == 1) {
            System.out.println("Mảng sau khi xóa là: ");
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + "\t");
            }
        } else {
            System.out.println("Không tìm thấy phần tử cần xoá !!!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        XoaPhanTuKhoiMang delete = new XoaPhanTuKhoiMang();
        System.out.println("Nhập đồ dài của mảng: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ [" + (i + 1) + "] : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Phần tử trong mảng : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        delete.deleteArray(arr);
    }

}

