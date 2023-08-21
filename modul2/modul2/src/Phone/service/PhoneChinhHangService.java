package Phone.service;

import Phone.model.PhoneChinhHang;
import Phone.repository.PhoneChinhHangRepository;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PhoneChinhHangService implements IPhoneChinhHangService {
    PhoneChinhHangRepository phoneChinhHangRepository = new PhoneChinhHangRepository();
    private static Scanner scanner = new Scanner(System.in);

    public void them() {
        int code = autoCode();
        String ten = enterName();
        Double gia = enterPrice();
        int soLuong = enterQuantity();
        String nhaSanXuat = enterProducer();
        int thoiGian = Integer.parseInt(String.valueOf(enterTime()));
//        String phamvi = enterSecure();
    }
//    private String enterSecure() {
//        do {
//            try {
//                System.out.println("Nhập vào phạm vi bảo hành : ");
//                System.out.println("1.Trong nước ");
//                System.out.println("2.Quốc tế ");
//
//                int valid = Integer.parseInt(scanner.nextLine());
//                if (valid < 1 || valid > 2) {
//                    System.out.println("Chỉ được chọn 1 trong 2 !");
//                } else {
//                    switch (valid) {
//                        case 1:
//                            System.out.println("Trong nước ");
//                            break;
//                        case 2:
//                            System.out.println("Quốc tế ");
//                            break;
//                    }
//               }
//            } catch (NumberFormatException e) {
//                System.out.println("Lỗi không đúng định dạng !");
//                System.out.println("Chỉ được chọn 1 hoắc 2 !");
//            }
//        } while (true);
//    }

    private int enterTime() {
        int time = 0;
        do {
            System.out.println("Nhập vào thời gian bảo hành : (ngày)");
            try {
                time = Integer.parseInt(scanner.nextLine());
                if (time <= 0 || time > 720) {
                    System.out.println("Thời gian bảo hành phải lớn hơn 0 và không quá 720 ngày !");
                } else {
                    return time;
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi nhập không đúng định dạng !");
            }
        } while (true);

    }

    private String enterProducer() {
        String producer;
        System.out.println("Nhập tên nhà sản xuất : ");
        producer = scanner.nextLine();
        return producer;
    }

    private int enterQuantity() {
        int quantity = 0;
        do {
            System.out.println("Nhập số lượng : ");
            try {
                quantity = Integer.parseInt(scanner.nextLine());
                if (quantity <= 0) {
                    System.out.println("Số lượng phải lớn hơn 0 !");
                } else {
                    return quantity;
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi nhập không đúng định dạng !");
            }
        } while (true);
    }

    private Double enterPrice() {
        double price = 0;
        do {
            System.out.println("Nhâp giá bán : ");
            try {
                price = Double.parseDouble(scanner.nextLine());
                if (price <= 0) {
                    System.out.println("Đơn giá phải lớn hơn 0(vnd) !");
                } else {
                    return price;
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi không đúng định dạng !");
            }
        } while (true);
    }

    private String enterName() {
        String fullName;
        System.out.println("Nhập tên điện thoại : ");
        fullName = scanner.nextLine();
        return fullName;
    }

    private int autoCode() {
        int max = 1;
        for (PhoneChinhHang phoneChinhHang : phoneChinhHangRepository.getList()) {
            if (phoneChinhHang.getCode() > max) {
                max = phoneChinhHang.getCode();
            }
        }
        return max + 1;
    }

    public void hienThi() {
        List<PhoneChinhHang> phoneChinhHangList = phoneChinhHangRepository.getList();
        System.out.println("Danh sách điện thoại chính hãng :");
        for (PhoneChinhHang phoneChinhHang : phoneChinhHangList) {
            System.out.println(phoneChinhHang);
        }
    }

    public void xoa() {
        do {
            hienThi();
            System.out.println("---Xóa điện thoại---");
            System.out.println("Nhập vào mã điện thoại : ");
            int id = Integer.parseInt(scanner.nextLine());

            int index = findCode(id);
            if (index != -1){
                System.out.println("Bạn có muốn xóa điện thoại có mã : "+ id);
                System.out.println("1.Đồng ý ");
                System.out.println("2.Hủy bỏ ");

                int delete = Integer.parseInt(scanner.nextLine());
            }
            if (index == 1){
                List<PhoneChinhHang> newList = phoneChinhHangRepository.getList();
                newList.remove(index);
                phoneChinhHangRepository.delete(newList);
                System.out.println("Đã xóa thành công !");
            }
        }while (true);
    }

    private int findCode(int id) {
        List<PhoneChinhHang> phoneChinhHangList = phoneChinhHangRepository.getList();
        for (PhoneChinhHang phoneChinhHang : phoneChinhHangList) {
            for (int i = 0; i < phoneChinhHangList.size(); i++) {
                if (Objects.equals(phoneChinhHangList.get(i).getCode(), id)) ;
                return 1;
            }
        }
        return -1;
    }

    public void timKiem() {
        do {
            hienThi();
            System.out.println("--Tìm kiếm điện thoại--");
            System.out.println("Nhập mã điện thoại : ");
            int id = Integer.parseInt(scanner.nextLine());
            PhoneChinhHang phoneChinhHang = finfId(id);
            if (phoneChinhHang != null) {
                System.out.println("Đã tìm thấy điên thoại !");
                System.out.println(phoneChinhHang);
            } else {
                System.out.println("Không tìm thấy điện thoại có mã " + id);
            }
        } while (true);
    }

    private PhoneChinhHang finfId(int id) {
        List<PhoneChinhHang> phoneChinhHangList = phoneChinhHangRepository.getList();
        for (PhoneChinhHang phoneChinhHang : phoneChinhHangList) {
            if (phoneChinhHang.getCode() == id) {
                return phoneChinhHang;
            }
        }
        return null;
    }

    public void chinhSua() {
    }
}
