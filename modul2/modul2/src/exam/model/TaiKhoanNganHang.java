package exam.model;

public abstract class TaiKhoanNganHang {
    int id;
    String maTk,tenChuTk,ngayTaoTk;

    public TaiKhoanNganHang(int id, String maTk, String tenChuTk, String ngayTaoTk) {
        this.id = id;
        this.maTk = maTk;
        this.tenChuTk = tenChuTk;
        this.ngayTaoTk = ngayTaoTk;
    }

    public TaiKhoanNganHang() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaTk() {
        return maTk;
    }

    public void setMaTk(String maTk) {
        this.maTk = maTk;
    }

    public String getTenChuTk() {
        return tenChuTk;
    }

    public void setTenChuTk(String tenChuTk) {
        this.tenChuTk = tenChuTk;
    }

    public String getNgayTaoTk() {
        return ngayTaoTk;
    }

    public void setNgayTaoTk(String ngayTaoTk) {
        this.ngayTaoTk = ngayTaoTk;
    }

    @Override
    public String toString() {
        return id+","+maTk+","+tenChuTk+","+ngayTaoTk;
    }
    public abstract String getInfoTk();
}
