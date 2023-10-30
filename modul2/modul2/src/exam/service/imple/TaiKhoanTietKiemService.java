package exam.service.imple;

import exam.model.TaiKhoanTietKiem;
import exam.repository.imple.TaiKhoanTietKiemRepository;
import exam.service.ITaiKhoanTietKiemService;

import java.util.List;
import java.util.Scanner;

public class TaiKhoanTietKiemService implements ITaiKhoanTietKiemService {
    TaiKhoanTietKiemRepository repository = new TaiKhoanTietKiemRepository();
    Scanner sc = new Scanner(System.in);
    @Override
    public void themMoi() {
        List<TaiKhoanTietKiem> taiKhoanTietKiems = repository.getInfoCSV();
        int soTienTietKiem,id;
        String ngayGuiTietKiem,kiHan,maTk,tenChuTk,ngayTaoTk,laiSuat;
//        System.out.println("Nhap id tai khoan: ");
        id = taiKhoanTietKiems.get(taiKhoanTietKiems.size()-1).getId() + 1;
        System.out.println("Nhap ma tk: ");
        maTk = sc.nextLine();
        System.out.println("Nhap ten chu tk: ");
        tenChuTk = sc.nextLine();
        System.out.println("Nhap ngay tao tk: ");
        ngayTaoTk = sc.nextLine();
        System.out.println("Nhap so tien gui tiet kiem: ");
        soTienTietKiem = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap lai suat: ");
        laiSuat = sc.nextLine();
        System.out.println("Nhap nngay gui tiet kiem: ");
        ngayGuiTietKiem = sc.nextLine();
        System.out.println("Nhap ki han: ");
        kiHan = sc.nextLine();
        TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem(id,maTk,tenChuTk,ngayTaoTk,soTienTietKiem,laiSuat,ngayGuiTietKiem,kiHan);
        repository.them(taiKhoanTietKiem);
        xemDanhSach();
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
        List<TaiKhoanTietKiem> taiKhoanTietKiems = repository.getInfoCSV();
        for (int i = 0; i < taiKhoanTietKiems.size(); i++) {
            if (taiKhoanTietKiems.get(i) != null) {
                System.out.println(taiKhoanTietKiems.get(i).getInfoTk());
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
}
