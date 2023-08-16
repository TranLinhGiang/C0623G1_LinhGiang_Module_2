package ss12_java_collection_framework.bai_tap.service;

import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);
    void editProductById (int id, Product product);
    void removeProductById (int id);
    List<Product> displayProductById ();
    Product searchProduct (String name);
    List<Product> getProducts();

    List<Product> sortListByPriceAscending();

    List<Product> sortListByPriceDecrease();
}
