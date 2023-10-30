package exam.service.imple;

import exam.model.TaiKhoanThanhToan;
import exam.repository.imple.TaiKhoanThanhToanRepository;
import exam.service.ITaiKhoanThanhToanService;


import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanThanhToanService implements ITaiKhoanThanhToanService {
    Scanner sc = new Scanner(System.in);
    TaiKhoanThanhToanRepository repository = new TaiKhoanThanhToanRepository();
    @Override
    public void themMoi() throws Exception {
        List<TaiKhoanThanhToan> taiKhoanThanhToanList = repository.getInfoCSV();
        try {
            String maTk,tenChuTk,ngayTaoTk,soThe;
            int id,soTienTrongTaiKhoan;
            id = taiKhoanThanhToanList.get(taiKhoanThanhToanList.size()-1).getId() + 1;
            System.out.println("Nhap ma tk: ");
            maTk = sc.nextLine();
            System.out.println("Nhap ten chu tk: ");
            tenChuTk = sc.nextLine();
            System.out.println("Nhap ngay tao tk: ");
            ngayTaoTk = sc.nextLine();
            System.out.println("Nhap so the: ");
            soThe = sc.nextLine();
            System.out.println("Nhap so tien trong tk: ");
            soTienTrongTaiKhoan = Integer.parseInt(sc.nextLine());
            TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan(id,maTk,tenChuTk,ngayTaoTk,soThe,soTienTrongTaiKhoan);
            repository.them(taiKhoanThanhToan);
            xemDanhSach();
        }catch (Exception e){
            throw new Exception(e);
        }
    }

    @Override
    public void xoa() {
        int id;
        System.out.print("Nhap id muon xoa: ");
        id = sc.nextInt();
        repository.xoa(id);
        xemDanhSach();
    }

    @Override
    public void xemDanhSach() {
        List<TaiKhoanThanhToan> taiKhoanThanhToanList = repository.getInfoCSV();
        for (int i = 0; i < taiKhoanThanhToanList.size(); i++) {
            if (taiKhoanThanhToanList.get(i) != null) {
                System.out.println(taiKhoanThanhToanList.get(i).getInfoTk());
            }
        }
    }


    @Override
    public void timKiem() {
        int id;
        System.out.print("Nhap id muon tim kiem: ");
        id = sc.nextInt();
        repository.timKiem(id);
    }
//    public void nhapId() {
//        List<TaiKhoanThanhToan> taiKhoanThanhToanList = repository.getInfoCSV();
//         int id  = Integer.parseInt(taiKhoanThanhToanList.get(taiKhoanThanhToanList.size()-1).getId()) + 1;
//    }


}
