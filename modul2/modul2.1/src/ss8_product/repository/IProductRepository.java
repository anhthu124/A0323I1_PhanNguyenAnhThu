package ss8_product.repository;

import ss8_product.model.Product;

public interface IProductRepository {
    Product[] getListProduct();

    void addProduct(Product product);

    void deleteProductById(int id);

    void updateProductById(int id);

    void findProductByName(String name);
}
