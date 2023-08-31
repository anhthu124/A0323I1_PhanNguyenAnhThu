package ss8_product.controller;

import ss8_product.service.IProductService;
import ss8_product.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void displayMenu() {
        IProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng :");
            System.out.println("1.Display" +
                    "\n 2.Add" +
                    "\n 3.Edit" +
                    "\n 4.Delete" +
                    "\n 5.Find" +
                    "\n 6.Exit"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Chức năng hiển thị");
                    productService.display();
                    break;
                case 2:
                    System.out.println("Chức năng thêm mới");
                    productService.add();
                    break;
                case 3:
                    System.out.println("Code chức năng sửa");
                    productService.upDate();
                    break;
                case 4:
                    System.out.println("Chức năng xoá");
                    productService.delete();
                    break;
                case 5:
                    System.out.println(" Chức năng tìm kiếm bằng tên");
                    productService.find();
                default:
                    flag = false;
            }
        } while (flag);

    }
}
