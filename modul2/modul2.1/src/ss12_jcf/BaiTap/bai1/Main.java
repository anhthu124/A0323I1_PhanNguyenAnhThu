package ss12.BaiTap;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        productManager.addProduct(new Product("1", "Product 1", 10.99));
        productManager.addProduct(new Product("2", "Product 2", 9.99));

        productManager.displayProducts();

        productManager.updateProduct("1", "Updated Product 1", 15.99);

        productManager.removeProduct("2");

        productManager.searchProductByName("Updated Product 1");

        productManager.sortProductsByPriceAscending();
        productManager.displayProducts();

        productManager.sortProductsByPriceDescending();
        productManager.displayProducts();
    }
}



