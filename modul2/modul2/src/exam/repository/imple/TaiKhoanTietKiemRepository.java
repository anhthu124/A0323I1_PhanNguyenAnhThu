package exam.repository.imple;


import exam.model.TaiKhoanTietKiem;
import exam.repository.ITaiKhoanTietKiemRepository;
import exam.ultis.ReadWriteFile;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanTietKiemRepository implements ITaiKhoanTietKiemRepository {
    private static final String PATH_TIET_KIEM = "modul2/src/exam/data/TaiKhoanTietKiem.csv";
    public List<TaiKhoanTietKiem> getInfoCSV(){
        List<String> stringList = exam.ultis.ReadWriteFile.ReadFile(PATH_TIET_KIEM);
        List<TaiKhoanTietKiem> list = new ArrayList<>();
        String[] arr = null;
        try {
            for(String str : stringList){
                arr = str.split(",");
                TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem(Integer.parseInt(arr[0]), arr[1] , arr[2] , arr[3], Integer.parseInt(arr[4]), arr[5] ,arr[6], arr[7]);
                list.add(taiKhoanTietKiem);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("loi doc file");
        }
        return list;
    }
    @Override
    public void them(TaiKhoanTietKiem taiKhoanTietKiem) {
        List<String> stringList = new ArrayList<String>();
        stringList.add(taiKhoanTietKiem.getInfoTk());
        exam.ultis.ReadWriteFile.WriteFile(PATH_TIET_KIEM,stringList,true);
    }

    @Override
    public void xoa(int id) {
        Scanner sc = new Scanner(System.in);
        List<TaiKhoanTietKiem> taiKhoanTietKiems = getInfoCSV();
        for (int i = 0; i < taiKhoanTietKiems.size(); i++) {
            if (taiKhoanTietKiems.get(i).getId() == id) {
                System.out.println("Ban co muon xoa khong");
                System.out.println("1. Co");
                System.out.println("2. Khong");
                int temp = Integer.parseInt(sc.nextLine());
                if (temp == 1) {
                    taiKhoanTietKiems.remove(taiKhoanTietKiems.get(i));
                    List<String> list = new ArrayList<String>();
                    for (int j = 0; j < taiKhoanTietKiems.size(); j++) {
                        list.add(taiKhoanTietKiems.get(j).getInfoTk());
                    }
                    ReadWriteFile.WriteFile(PATH_TIET_KIEM,list,false);
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
            List<TaiKhoanTietKiem> taiKhoanTietKiems = getInfoCSV();
            for (int i = 0; i < taiKhoanTietKiems.size(); i++) {
                if (taiKhoanTietKiems.get(i).getId() == id) {
                    System.out.println(taiKhoanTietKiems.get(i));
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
