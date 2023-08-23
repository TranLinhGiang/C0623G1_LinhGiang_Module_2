package ss17_binary_file_serialization.bai_tap.bai1.repository.impl;

import ss17_binary_file_serialization.bai_tap.bai1.model.Product;
import ss17_binary_file_serialization.bai_tap.bai1.repository.IProductRepo;

import java.util.ArrayList;
import java.util.List;

public class ProductRepoImpl implements IProductRepo {
    private final List<Product> products = new ArrayList<>();
    public static  final String MATH =",";
    private  final String pathFileData= "F:\\C0623G1_LinhGiang_Module_2\\untitled\\src\\ss17_binary_file_serialization\\bai_tap\\bai1\\data\\data.csv";


    @Override
    public void addProduct(Product product) {
        List<Product> products= this.getProducts();
        this.products.add(product);

    }

    @Override
    public List<Product> getProducts() {
        return this.products;
    }

    @Override
    public Product searchProduct(String name) {
        Product productToFind = null;
        for (Product valueProduct : products) {
            if (valueProduct.getName().contains(name)) {
                productToFind = valueProduct;
            }
        }
        return productToFind;
    }
}
