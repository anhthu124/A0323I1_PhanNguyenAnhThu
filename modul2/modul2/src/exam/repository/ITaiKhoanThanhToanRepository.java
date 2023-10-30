package exam.repository;

import exam.model.TaiKhoanThanhToan;


public interface ITaiKhoanThanhToanRepository {
    void them(TaiKhoanThanhToan taiKhoanThanhToan);
    void xoa(int id);
    void timKiem(int id);
}
