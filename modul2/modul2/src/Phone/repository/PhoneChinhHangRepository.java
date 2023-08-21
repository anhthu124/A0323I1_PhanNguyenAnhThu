package Phone.repository;

import Phone.model.PhoneChinhHang;
import Phone.untils.ReadWriteFile;

import java.util.List;

public class PhoneChinhHangRepository implements IPhoneChinhHangRepository{
    public static final String SRC_CHINHHANG = "src/Phone/data/ChinhHang.csv ";
    public static final String SRC_XACHTAY = "src/Phone/data/XachTay.csv  ";

    public List<PhoneChinhHang> getList() {
        return new ReadWriteFile().readChinhHang(SRC_CHINHHANG);
    }

    public void delete(List<PhoneChinhHang> newList) {
        new ReadWriteFile().readChinhHang(SRC_CHINHHANG);
    }
}
