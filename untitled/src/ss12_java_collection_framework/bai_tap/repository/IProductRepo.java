package ss12_java_collection_framework.bai_tap.repository;

import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.List;

public interface IProductRepo {
    void addProduct(Product product);


    void editProduct(int id, Product product);

    void editProductById(int id, Product product);

    void editProducById(int id, Product product);

    void removeProductById(int id);

    List<Product> displayProductById();

    Product searchProduct(String name);

    List<Product> sortListByPriceAscending();

    List<Product> sortListByPriceDecrease();

}