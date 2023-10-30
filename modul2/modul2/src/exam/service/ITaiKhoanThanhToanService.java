package exam.service;

import java.io.FileNotFoundException;

public interface ITaiKhoanThanhToanService {
    void themMoi() throws FileNotFoundException, Exception;
    void xoa();
    void xemDanhSach();
    void timKiem();
}
