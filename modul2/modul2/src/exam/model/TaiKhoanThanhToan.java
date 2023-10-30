package exam.model;

public class TaiKhoanThanhToan extends TaiKhoanNganHang{
    String soThe;
    int soTienTrongTaiKhoan;

    public TaiKhoanThanhToan(int id, String maTk, String tenChuTk, String ngayTaoTk, String soThe, int soTienTrongTaiKhoan) {
        super(id, maTk, tenChuTk, ngayTaoTk);
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public TaiKhoanThanhToan(String soThe, int soTienTrongTaiKhoan) {
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public int getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(int soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    @Override
    public String toString() {
        return super.toString()+ "," + soThe + "," + soTienTrongTaiKhoan;
    }
    public String getInfoTk() {
        return super.toString()+ "," + soThe + "," + soTienTrongTaiKhoan;
    }
}
