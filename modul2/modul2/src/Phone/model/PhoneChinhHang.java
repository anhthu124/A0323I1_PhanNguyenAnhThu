package Phone.model;

public class PhoneChinhHang extends Phone{
    private int thoiGian;
    private String phamVi;

    public PhoneChinhHang() {
    }

    public PhoneChinhHang(int thoiGian, String phamVi) {
        this.thoiGian = thoiGian;
        this.phamVi = phamVi;
    }

    public PhoneChinhHang(int code, String ten, Double gia, int soLuong, String nhaSanXuat, int thoiGian, String phamVi) {
        super(code, ten, gia, soLuong, nhaSanXuat);
        this.thoiGian = thoiGian;
        this.phamVi = phamVi;
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getPhamVi() {
        return phamVi;
    }

    public void setPhamVi(String phamVi) {
        this.phamVi = phamVi;
    }

    @Override
    public String toString() {
        return super.toString()+","+thoiGian+","+phamVi;
    }
}
