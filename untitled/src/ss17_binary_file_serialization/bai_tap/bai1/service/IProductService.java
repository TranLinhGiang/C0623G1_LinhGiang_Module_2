package ss17_binary_file_serialization.bai_tap.bai1.service;

import ss17_binary_file_serialization.bai_tap.bai1.model.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);

    List<Product> getProducts();

    Product searchProduct(String name);
}
