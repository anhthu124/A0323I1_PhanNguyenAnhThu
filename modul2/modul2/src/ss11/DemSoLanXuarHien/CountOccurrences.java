package ss11.DemSoLanXuarHien;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi : ");
        String str = scanner.nextLine();

        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        for (Character key : charMap.keySet()) {
            System.out.println(key + " - " + charMap.get(key));
        }
    }
}
