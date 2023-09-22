package ss12.BaiTap.baiTapThem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập chuỗi");
        String string = sc.nextLine();
        String[] chuoi = string.split(" ");
        for (String element : chuoi) {
            Integer value = null;
            if (hashMap.containsKey(element)) {
                value = hashMap.get(element);
                value++;
                hashMap.replace(element, value);
            } else {
                hashMap.put(element, 1);
            }
        }
        System.out.println(" Số lân xuất hiện " + hashMap.toString());
    }
}
