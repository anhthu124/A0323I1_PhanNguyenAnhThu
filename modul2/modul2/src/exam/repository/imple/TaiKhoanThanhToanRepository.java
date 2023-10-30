package exam.repository.imple;

import exam.model.TaiKhoanThanhToan;
import exam.repository.ITaiKhoanThanhToanRepository;
import exam.ultis.ReadWriteFile;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanThanhToanRepository implements ITaiKhoanThanhToanRepository {
    Scanner sc = new Scanner(System.in);
    private static final String PATH_THANH_TOAN = "modul2/src/exam/data/TaiKhoanThanhToan.csv";
    public List<TaiKhoanThanhToan> getInfoCSV(){
        List<String> stringList = ReadWriteFile.ReadFile(PATH_THANH_TOAN);
        List<TaiKhoanThanhToan> list = new ArrayList<>();
        String[] arr = null;
            for(String str : stringList){
                arr = str.split(",");
                TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan(Integer.parseInt(arr[0]), arr[1] , arr[2] , arr[3], arr[4], Integer.parseInt(arr[5]));
                list.add(taiKhoanThanhToan);
            }
        return list;
    }

    @Override
    public void them(TaiKhoanThanhToan taiKhoanThanhToan) {
        List<String> list = new ArrayList<String>();
//        List<TaiKhoanThanhToan> taiKhoanThanhToanList = getInfoCSV();
//        for (int i = 0; i < taiKhoanThanhToanList.size(); i++) {
//            if (taiKhoanThanhToan.getId() == taiKhoanThanhToanList.get(i).getId()){
//                System.out.println("id da ton tai.");
//                break;
//            } else if (i == taiKhoanThanhToanList.size()) {
//                list.add(taiKhoanThanhToan.getInfoTk());
//                ReadWriteFile.WriteFile(PATH_THANH_TOAN,list,true);
//            }
//        }
        list.add(taiKhoanThanhToan.getInfoTk());
        ReadWriteFile.WriteFile(PATH_THANH_TOAN,list,true);
    }

    @Override
    public void xoa(int id) {
        List<TaiKhoanThanhToan> taiKhoanThanhToanList = getInfoCSV();
        for (int i = 0; i < taiKhoanThanhToanList.size(); i++) {
            if (taiKhoanThanhToanList.get(i).getId() == id) {
                System.out.println("Ban co muon xoa khong");
                System.out.println("1. Co");
                System.out.println("2. Khong");
                int temp = Integer.parseInt(sc.nextLine());
                if (temp == 1) {
                    taiKhoanThanhToanList.remove(taiKhoanThanhToanList.get(i));
                    List<String> list = new ArrayList<String>();
                    for (int j = 0; j < taiKhoanThanhToanList.size(); j++) {
                        list.add(taiKhoanThanhToanList.get(j).getInfoTk());
                    }
                    ReadWriteFile.WriteFile(PATH_THANH_TOAN,list,false);
                    System.out.println("Xoa thanh cong");
                    break;
                } else {
                    System.out.println("Huy chuong trinh xoa ");
                    break;
                }
            }
        }

    }

    @Override
    public void timKiem(int id) {
        try {
            List<TaiKhoanThanhToan> taiKhoanThanhToanList = getInfoCSV();
            for (int i = 0; i < taiKhoanThanhToanList.size(); i++) {
                if (taiKhoanThanhToanList.get(i).getId() == id) {
                    System.out.println(taiKhoanThanhToanList.get(i));
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
