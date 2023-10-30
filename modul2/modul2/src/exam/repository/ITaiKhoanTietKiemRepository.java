package exam.repository;


import exam.model.TaiKhoanTietKiem;

public interface ITaiKhoanTietKiemRepository {
    void them(TaiKhoanTietKiem taiKhoanTietKiem);
    void xoa(int id);
    void timKiem(int id);
}
