package casestudy.service;

import casestudy.model.BenhNhan;
import casestudy.model.BenhNhanThuong;
import casestudy.model.BenhNhanVIP;
import casestudy.repository.BenhNhanRepository;
import casestudy.repository.IBenhNhanRepository;
import casestudy.utils.GetInput;

import java.util.Map;
import java.util.Scanner;

public class BenhNhanService extends GetInput implements IBenhNhanService {
    BenhNhanRepository facilityRepository = new BenhNhanRepository();
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void displayListMaintenance() {
        Map<BenhNhan, Integer> map = IBenhNhanRepository.getList();
        for (Map.Entry<BenhNhan, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value >= 5) {
                if (entry.getKey() instanceof BenhNhanThuong) {
                    BenhNhanThuong benhNhanThuong = (BenhNhanThuong) entry.getKey();
                    System.out.println("Used: " + value + ", " + benhNhanThuong);
                } else {
                    BenhNhanVIP benhNhanVIP = (BenhNhanVIP) entry.getKey();
                    System.out.println("Used: " + value + ", " + benhNhanVIP);
                }
            }
        }
    }

    @Override
    public void add() {
        System.out.println("1. Bệnh nhân thường: \n2. Bệnh nhân VIP \n3. Back to menu: \nEnter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        System.out.println("So thu tu benh an: ");
        String sttService = getText();
        System.out.println("Ma benh an: ");
        String maBenhAn = getText();
        System.out.println("Ma benh nha: ");
        String maBenhNhan=getText();
        System.out.println("Ten benh nhan ");
        String tenBenhNhan = getText();
        System.out.println("Ngay nhap vien");
        String ngayNhapVien = getText();
        System.out.println("Ngay ra vien");
        String ngayRaVien = getText();
        System.out.println(" Ly do nhap vien");
        String lyDo=getText();
        switch (choice) {
            case 1:
                System.out.println("nhap phi nawm vien:");
                String phiNamVienService = getText();
                BenhNhanThuong benhNhanThuong = new BenhNhanThuong();
                IBenhNhanRepository.add(benhNhanThuong);
                break;
            case 2:
                System.out.println("Loai VIP ");
                String loaiVIP = getText();
                BenhNhanVIP benhNhanVIP = new BenhNhanVIP();
                IBenhNhanRepository.add(benhNhanVIP);
                break;


        }
    }

    @Override
    public void displayList() {
        Map<BenhNhan, Integer> map = IBenhNhanRepository.getList();
        for (Map.Entry<BenhNhan, Integer> entry : map.entrySet()) {
            BenhNhan benhNhan = entry.getKey();
            int value = entry.getValue();
            if (benhNhan instanceof BenhNhanThuong) {
                BenhNhanThuong benhNhanThuong = (BenhNhanThuong) benhNhan;
                System.out.println("Used: " + value + ", " + benhNhanThuong);
            } else {
                BenhNhanVIP benhNhanVIP = (BenhNhanVIP) benhNhan;
                System.out.println("Used: " + value + ", " + benhNhanVIP);
            }
        }
    }
}
