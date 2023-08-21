package ss3MangVaPhuongThuc.BT;

import java.util.Arrays;
import java.util.Scanner;

public class TongDuongCheoMaTranVuong {
    public static void main(String[] args) {
        int sum1 = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập cạnh của ma trận");
        int edge = input.nextInt();
        int[][] matrix = new int[edge][edge];

        for (int i = 0; i < edge; i++) {
            for (int j = 0; j < edge; j++) {
                System.out.println("Nhập phần tử tại chỉ mục [" + i + "]" + "[" + j + "]");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));

        for (int g = 0; g < edge; g++) {
            sum1 += matrix[g][g];
        }


        System.out.println("Tổng đường chéo từ trái sang phải = " + sum1);
    }
}
