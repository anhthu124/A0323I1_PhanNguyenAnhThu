package Phone.model;

public class PhoneXachTay extends Phone{
    private String quocGia;
    private String trangThai;

    public PhoneXachTay() {
    }

    public PhoneXachTay(String quocGia, String trangThai) {
        this.quocGia = quocGia;
        this.trangThai = trangThai;
    }

    public PhoneXachTay(int code, String ten, Double gia, int soLuong, String nhaSanXuat, String quocGia, String trangThai) {
        super(code, ten, gia, soLuong, nhaSanXuat);
        this.quocGia = quocGia;
        this.trangThai = trangThai;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return super.toString()+","+quocGia+","+trangThai;
    }
}
