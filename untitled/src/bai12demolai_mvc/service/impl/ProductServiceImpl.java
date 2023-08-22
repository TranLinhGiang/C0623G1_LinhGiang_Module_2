package bai12demolai_mvc.service.impl;

import bai12demolai_mvc.model.Product;
import bai12demolai_mvc.service.IProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IProductService {
    private ArrayList<Product> products= new ArrayList<>();


    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void editProduct(int id) {

    }

    @Override
    public void deleteProduct(int id) {

    }

    @Override
    public List<Product> displayProduct() {
        return null;
    }

    @Override
    public void searchProductByName(String name) {

    }

    @Override
    public List<Product> sapXepTangDan() {
        return null;
    }

    @Override
    public List<Product> sapXepGiamDan() {
        return null;
    }
}
