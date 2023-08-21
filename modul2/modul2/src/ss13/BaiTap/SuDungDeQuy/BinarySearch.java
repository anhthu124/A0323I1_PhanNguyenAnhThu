package ss13.BaiTap.SuDungDeQuy;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử của mảng: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Nhập vào các phần tử của mảng:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);

        System.out.print("Nhập vào giá trị cần tìm kiếm: ");
        int value = scanner.nextInt();
        int result = binarySearch(array, 0, length - 1, value);

        if (result == -1) {
            System.out.println("Không tìm thấy giá trị trong mảng.");
        } else {
            System.out.println("Giá trị " + value + " được tìm thấy tại vị trí " + result + " trong mảng.");
        }
    }

    private static int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) return -1;
        int middle = (left + right) / 2;
        if (array[middle] == value) return middle;
        if (value > array[middle]) return binarySearch(array, middle + 1, right, value);
        return binarySearch(array, left, middle - 1, value);
    }
}

