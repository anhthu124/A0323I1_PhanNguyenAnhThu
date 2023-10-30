package Phone.untils;

import Phone.model.PhoneChinhHang;
import Phone.model.PhoneXachTay;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public List<PhoneChinhHang> readChinhHang(String src) {
        List<PhoneChinhHang> phoneChinhHangs = new ArrayList<>();;
        try {
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            File file = new File(src);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                phoneChinhHangs.add(readChinhHangCsvLine(line));
            }

            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file !");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file !");
        }
        return phoneChinhHangs;
    }

    private PhoneChinhHang readChinhHangCsvLine(String src) {
        String[] strings = src.split(",");
        return new PhoneChinhHang(Integer.parseInt(strings[0]), strings[1], Double.parseDouble(strings[2]), Integer.parseInt(strings[3]), strings[4], Integer.parseInt(strings[5]), strings[6]);
    }

    public static void writeChinhHang(String src, String value, boolean append) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(src);
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(value);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file !");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Lỗi đóng file !");
            }
        }
    }


    public static List<PhoneXachTay> readXachTay(String src) {
        List<PhoneXachTay> phoneXachTays = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(src);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                phoneXachTays.add(readXachTayCsvLine(line));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file !");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file !");
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Lỗi đóng file !");
            }
        }
        return phoneXachTays;
    }

    private static PhoneXachTay readXachTayCsvLine(String src) {
        String[] strings = src.split(",");
        return new PhoneXachTay(Integer.parseInt(strings[0]), strings[1], Double.parseDouble(strings[2]), Integer.parseInt(strings[3]), strings[4], strings[5], strings[6]);
    }

    public static void writeXachTay(String src, String value, boolean append) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(src);
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(value);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file !");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Lỗi đóng file !");
            }
        }
    }

}
