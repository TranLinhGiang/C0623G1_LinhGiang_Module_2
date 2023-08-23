package ss17_binary_file_serialization.bai_tap.bai1.service.impl;

import ss17_binary_file_serialization.bai_tap.bai1.model.Product;
import ss17_binary_file_serialization.bai_tap.bai1.repository.impl.ProductRepoImpl;
import ss17_binary_file_serialization.bai_tap.bai1.service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private final ProductRepoImpl productRepo= new ProductRepoImpl();
    @Override
    public void addProduct(Product product) {
    productRepo.addProduct(product);
    }

    @Override
    public List<Product> getProducts() {
        return productRepo.getProducts();
    }

    @Override
    public Product searchProduct(String name) {
        return productRepo.searchProduct(name);
    }
}
