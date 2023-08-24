package ss17_binary_file_serialization.bai_tap.bai1.repository.impl;

import ss17_binary_file_serialization.bai_tap.bai1.model.Product;
import ss17_binary_file_serialization.bai_tap.bai1.repository.IProductRepo;
import ss17_binary_file_serialization.bai_tap.bai1.util.FileUtil;

import java.util.ArrayList;
import java.util.List;

public class ProductRepoImpl implements IProductRepo {

    private  final String pathFileData= "F:\\module 2\\C0623G1_LinhGiang_Module_2\\untitled\\src\\ss17_binary_file_serialization\\bai_tap\\bai1\\data\\data.dat";


    @Override
    public void addProduct(Product product) {
        List<Product> products= this.getProducts();
        products.add(product);
        FileUtil.writeFile(pathFileData,products);
    }

    @Override
    public List<Product> getProducts() {
        List<Product> products = FileUtil.readFile(pathFileData);
        return products;
    }

    @Override
    public Product searchProduct(String name) {
        List<Product> products= this.getProducts();
        Product productToFind = null;
        for (Product valueProduct : products) {
            if (valueProduct.getName().contains(name)) {
                productToFind = valueProduct;
            }
        }
        return productToFind;
    }
}
