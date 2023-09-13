package ss11.ĐaoNguoc;

import java.util.Stack;

public class DaoNguocChuoi {
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder reversedString = new StringBuilder();

        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World!";

        System.out.println("Chuỗi ban đầu: " + input);

        String reversed = reverseString(input);

        System.out.println("Chuỗi sau khi đảo ngược: " + reversed);
    }
}

