package exam.model;

public class TaiKhoanTietKiem extends TaiKhoanNganHang{
    int soTienTietKiem;
    String laiSuat;
    String ngayGuiTietKiem,kiHan;

    public TaiKhoanTietKiem(int id, String maTk, String tenChuTk, String ngayTaoTk, int soTienTietKiem, String ngayGuiTietKiem, String laiSuat, String kiHan) {
        super(id, maTk, tenChuTk, ngayTaoTk);
        this.soTienTietKiem = soTienTietKiem;
        this.laiSuat = laiSuat;
        this.ngayGuiTietKiem = ngayGuiTietKiem;
        this.kiHan = kiHan;
    }

    public TaiKhoanTietKiem(int soTienTietKiem, String laiSuat, String ngayGuiTietKiem, String kiHan) {
        this.soTienTietKiem = soTienTietKiem;
        this.laiSuat = laiSuat;
        this.ngayGuiTietKiem = ngayGuiTietKiem;
        this.kiHan = kiHan;
    }

    public int getSoTienTietKiem() {
        return soTienTietKiem;
    }

    public void setSoTienTietKiem(int soTienTietKiem) {
        this.soTienTietKiem = soTienTietKiem;
    }

    public String getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(String laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getNgayGuiTietKiem() {
        return ngayGuiTietKiem;
    }

    public void setNgayGuiTietKiem(String ngayGuiTietKiem) {
        this.ngayGuiTietKiem = ngayGuiTietKiem;
    }

    public String getKiHan() {
        return kiHan;
    }

    public void setKiHan(String kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return super.toString()+ "," + soTienTietKiem + "," + ngayGuiTietKiem + "," + laiSuat + "," + kiHan;
    }

    @Override
    public String getInfoTk() {
        return super.toString()+ "," + soTienTietKiem + "," + ngayGuiTietKiem + "," + laiSuat + "," + kiHan;
    }

}
