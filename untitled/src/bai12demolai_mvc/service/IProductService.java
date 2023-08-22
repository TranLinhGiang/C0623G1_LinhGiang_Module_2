package bai12demolai_mvc.service;

import bai12demolai_mvc.model.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);

    void editProduct( int id);

    void deleteProduct(int id);

    List<Product> displayProduct();

    void searchProductByName( String name);

    List<Product> sapXepTangDan();

    List<Product> sapXepGiamDan();

}
