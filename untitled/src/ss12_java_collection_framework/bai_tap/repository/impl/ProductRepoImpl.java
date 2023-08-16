package ss12_java_collection_framework.bai_tap.repository.impl;

import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.repository.IProductRepo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepoImpl implements IProductRepo {
    private ArrayList<Product> products = new ArrayList<>();
    @Override
    public void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public void editProduct(int id, Product product) {
        int index;
        for (Product valueProduct : products) {
            if (valueProduct.getId() == id) {
                index = products.indexOf(valueProduct);
                products.set(index,product);
            }
        }
    }

    @Override
    public void editProductById(int id, Product product) {
        int index;
        for (Product valueProduct : products) {
            if (valueProduct.getId() == id) {
                index = products.indexOf(valueProduct);
                products.set(index,product);
            }
        }
    }

    @Override
    public void editProducById(int id, Product product) {

    }

    @Override
    public void removeProductById(int id) {
        int index;
        for (Product product:products) {
            if(product.getId()==id){
                index= products.indexOf(product);
                products.remove(index);
            }
        }
    }

    @Override
    public List<Product> displayProductById() {
        return this.products;
    }

    @Override
    public Product searchProduct(String name) {
        Product productToFind = new Product();
        for (Product valueProducts :
                products) {
            if (valueProducts.getName().equals(name)) {
                productToFind = valueProducts;
            }
        }
        return productToFind;
    }

    @Override
    public List<Product> sortListByPriceAscending() {
//        Collections.sort(this.displayProductById());
        return this.displayProductById();
    }
    @Override
    public List<Product> sortListByPriceDecrease() {
        Collections.reverse(sortListByPriceAscending());
        return this.displayProductById();
    }
}
