package Phone.repository;

import Phone.model.PhoneChinhHang;
import Phone.untils.ReadWriteFile;

import java.util.List;

public class PhoneChinhHangRepository implements IPhoneChinhHangRepository{
    public static final String SRC_CHINHHANG = "D:\\Skill\\codegym\\model\\modul2\\modul2\\src\\Phone\\data\\ChinhHang.csv";
    public static final String SRC_XACHTAY = "modul2/modul2/src/Phone/data/XachTay.csv";

    public List<PhoneChinhHang> getList() {
        return new ReadWriteFile().readChinhHang(SRC_CHINHHANG);
    }
    public void delete(List<PhoneChinhHang> newList) {
        new ReadWriteFile().readChinhHang(SRC_CHINHHANG);
  }
//    public List<PhoneXachTay>getList(){
//        return ReadWriteFile().readXachTay(SRC_XACHTAY);
//    }
//    public  void delete(List<PhoneXachTay> newList ){
//        new ReadWriteFile().readXachTay(SRC_XACHTAY);
//
//    }
}
