package ss8_product.service.impl;

import ss8_product.model.Product;
import ss8_product.repository.IProductRepository;
import ss8_product.repository.impl.ProductRepository;
import ss8_product.service.IProductService;

import java.util.Scanner;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();


    @Override
    public void display() {
        Product[] products = productRepository.getListProduct();
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println((1 + i) + "." + products[i]);
            }

        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("nhập giá sản phẩm: ");
        int price = Integer.parseInt((scanner.nextLine()));
        System.out.println(" nhập mô tả sản phẩm: ");
        String moTa = scanner.nextLine();
        Product product = new Product(id, name, price, moTa);
        productRepository.addProduct(product);

    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id sp cần xoá");
        int deleteId = Integer.parseInt(scanner.nextLine());
        productRepository.deleteProductById(deleteId);

    }

    @Override
    public void upDate() {
        Product[] products = productRepository.getListProduct();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập id sản phầm cần chỉnh sửa ");
        int updateId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == updateId) {
                System.out.println("nhập lại tên sản phẩm");
                String updateName = scanner.nextLine();
                products[i].setName(updateName);
                System.out.println("nhập lại giá sản phẩm ");
                int updatePrice = Integer.parseInt(scanner.nextLine());
                products[i].setPrice(updatePrice);
                System.out.println("nhập lại mô tả sản phẩm :");
                String updateMota = scanner.nextLine();
                products[i].setMoTa(updateMota);
                break;
            }
        }
    }

    @Override
    public void find() {
        Product[] products = productRepository.getListProduct();
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Nhập tên sản phẩm cần tìm : ---");
        String ten = sc.nextLine();
        System.out.println("----Danh sách sản phẩm cần tìm là: ---");
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].getName().equals(ten)) {
                    System.out.println("" + products[i]);
                }
            }
        }
    }
}