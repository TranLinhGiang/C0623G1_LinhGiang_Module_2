package ss12_java_collection_framework.bai_tap.service.impl;

import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.repository.impl.ProductRepoImpl;
import ss12_java_collection_framework.bai_tap.service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {

    private final ProductRepoImpl productRepo = new ProductRepoImpl();

    @Override
    public void addProduct(Product product) {
        productRepo.addProduct(product);
    }

    @Override
    public void editProductById(int id, Product product) {
        productRepo.editProductById(id, product);
    }

    @Override
    public void removeProductById(int id) {
        productRepo.removeProductById(id);
    }

    @Override
    public List<Product> displayProductById() {
        return productRepo.displayProductById();
    }

    @Override
    public Product searchProduct(String name) {
        return productRepo.searchProduct(name);
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public List<Product> sortListByPriceAscending() {
        return productRepo.sortListByPriceAscending();
    }

    @Override
    public List<Product> sortListByPriceDecrease() {
        return productRepo.sortListByPriceDecrease();
    }

    @Override
    public String toString() {
        return "List{" +
                "\n" + getProducts() +
                "\n}";
    }
}
