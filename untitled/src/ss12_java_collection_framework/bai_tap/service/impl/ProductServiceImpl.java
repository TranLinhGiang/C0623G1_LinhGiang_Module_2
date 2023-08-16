package ss12_java_collection_framework.bai_tap.service.impl;

import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.repository.impl.ProductRepoImpl;
import ss12_java_collection_framework.bai_tap.service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {

    ProductRepoImpl productService = new ProductRepoImpl();

    @Override
    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    @Override
    public void editProductById (int id, Product product) {
        productService.editProductById(id,product);
    }

    @Override
    public void removeProductById(int id) {
        productService.removeProductById(id);
    }

    @Override
    public List<Product> displayProductById () {
        return productService.displayProductById();
    }

    @Override
    public Product searchProduct(String name) {
        return productService.searchProduct(name);
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public List<Product> sortListByPriceAscending() {
        return productService.sortListByPriceAscending();
    }

    @Override
    public List<Product> sortListByPriceDecrease() {
        return productService.sortListByPriceDecrease();
    }

    @Override
    public String toString() {
        return "List{" +
                "\n" + getProducts() +
                "\n}";
    }
}
