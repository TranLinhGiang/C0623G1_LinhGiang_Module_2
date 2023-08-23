package ss12_java_collection_framework.bai_tap.repository.impl;

import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.repository.IProductRepo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepoImpl implements IProductRepo {
    private final List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public void removeProductById(int id) {
        int index;
        for (Product product: products) {
            if (product.getId() == id) {
                index = products.indexOf(product);
                products.remove(index);
                break;
            }
        }
    }

    @Override
    public void editProductbyId(int id, Product product) {
        int index;
        for (Product valueProduct: products) {
            if (valueProduct.getId() == id) {
                index = products.indexOf(valueProduct);
                products.set(index,product);
            }
        }
    }

    @Override
    public Product searchProduct(String name) {
        Product productToFind = new Product();
        for (Product valueProducts : products) {
            if (valueProducts.getName().equals(name)) {
                productToFind = valueProducts;
            }
        }
        return productToFind;
    }

    @Override
    public List<Product> getProducts() {
        return this.products;
    }

    @Override
    public List<Product> sortListByPriceaAscending() {
        Collections.sort(this.getProducts());
        return this.getProducts();
    }

    @Override
    public List<Product> sortListByPriceaDecrease() {
        Collections.reverse(sortListByPriceaAscending());
        return this.getProducts();
    }
}
