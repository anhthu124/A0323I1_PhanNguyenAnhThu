package ss12.BaiTap;

import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(String id, String newName, double newPrice) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                product.setName(newName);
                product.setPrice(newPrice);
                break;
            }
        }
    }

    public void removeProduct(String id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void searchProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
    }

    public void sortProductsByPriceAscending() {
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
    }

    public void sortProductsByPriceDescending() {
        products.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
    }
}

