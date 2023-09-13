package ss11.KiemTraChuoi;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi : ");
        String str = scanner.nextLine();

        if (checkPalindrome(str)) {
            System.out.println("Là 1 chuỗi Palindrome");
        } else {
            System.out.println(" Không phải là 1 chuỗi Palindrome");
        }
    }

    public static boolean checkPalindrome(String str) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            String arr = String.valueOf(str.charAt(i)).toLowerCase(Locale.ROOT);
            if (!arr.equals(" ")) {
                stack.push(arr);
                queue.add(arr);
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            if (!stack.pop().equals(queue.remove())) {
                return false;
            }
        }
        return true;
    }
}
