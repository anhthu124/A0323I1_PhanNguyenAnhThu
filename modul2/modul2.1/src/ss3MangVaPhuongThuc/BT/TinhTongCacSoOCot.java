package ss3MangVaPhuongThuc.BT;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCacSoOCot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập hàng của mảng");
        int row = input.nextInt();
        System.out.println("Nhập colspan của mảng ");
        int col = input.nextInt();

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập phần tử tại chỉ mục [" + i + "]" + "[" + j + "]");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Nhập colspan vào máy tính");
        int cal = input.nextInt();
        int sum = 0;
        for (int k = 0; k < row; k++) {
            if (cal >= 0 && cal < col) {
                sum += matrix[k][cal];
            } else {
                System.out.println("Colspan này không tồn tại");
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        System.out.println("Tổng cộng  = " + sum);
    }
}


