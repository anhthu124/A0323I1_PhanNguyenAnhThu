package btMVC.repository.impl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {

    private static String file;
    private static String src;
    private static boolean append;
    private static int value;

    public static void writeFile(String srcStudent, String str, boolean b) {
        File file = new File(src);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(value);
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println("Lỗi đóng file");
            }
        }

    }

    public static List<String> readFile(String srcStudent) {
        List<String> strings = new ArrayList<>();
        File file = new File(src);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");
        } catch (IOException e) {
            System.out.println("Lỗi đoc file");
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Lỗi đóng file");
            }
        }
        return strings;
    }
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int temp;
            while ((temp = fileReader.read()) != -1) {
                System.out.println((char) temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");
        } catch (IOException e) {
            System.out.println("Lỗi đọc dữ liệu");
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Lỗi đóng file");
            }
        }
    }
}
