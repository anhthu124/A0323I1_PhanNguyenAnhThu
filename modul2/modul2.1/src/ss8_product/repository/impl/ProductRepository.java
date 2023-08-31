package ss8_product.repository.impl;

import ss8_product.model.Product;
import ss8_product.repository.IProductRepository;

import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    private static Product[] products = new Product[20];

    static {
        products[0] = new Product(1, "dầu xả", 14000, "clear");
        products[1] = new Product(2, "dầu gội", 16000, "clear");
        products[2] = new Product(3, "dầu ăn", 24000, "Trường An");
    }

    @Override
    public Product[] getListProduct() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }

    @Override
    public void deleteProductById(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                products[i] = null;
                break;
            }
        }
    }

    @Override
    public void updateProductById(int id) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                System.out.println("nhập lại tên sản phẩm");
                String updateName = sc.nextLine();
                products[i].setName(updateName);
                System.out.println("nhập lại giá sản phẩm");
                int updatePrice = Integer.parseInt(sc.nextLine());
                products[i].setPrice(updatePrice);
                System.out.println("nhập lại mô tả sản phẩm ");
                String updateMota = sc.nextLine();
                products[i].setMoTa(updateMota);
                break;
            }
        }
    }

    @Override
    public void findProductByName(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("-----Nhập tên sản phẩm cần tìm --");
        String ten = sc.nextLine();
        System.out.println("----Danh sách sản phẩm cần tìm là : ---");
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(ten)) {
                System.out.println("" + products[i]);
                break;
            }
        }
    }
}
