package ss16.mvc.BaiTap.BaiTap2;

import java.io.*;

public class ReadCSVFile {
    public static void main(String[] args) {
        String csvFile = "src/ss16/mvc/BaiTap/BaiTap2/Data";
        File file = new File(csvFile);
        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                String fields[] = line.split(",");
                System.out.println("Mã " + fields[0] + "Viết tắt" + fields[1] + "Tên Quốc gia" + fields[2]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
