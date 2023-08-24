package ss17_binary_file_serialization.bai_tap.bai1.model;

import java.io.Serializable;

public class Product implements Serializable,Comparable<Product>{
    private int id;
    private String name;
    private double price;
    private String describe; // mô tả
    private String manufactured;

    public Product() {
    }

    public Product(int id, String name, double price, String describe, String manufactured) {
        this.id = id;
        this.name = String.valueOf(name);
        this.price = price;
        this.describe = describe;
        this.manufactured = manufactured;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getManufactured() {
        return manufactured;
    }

    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", describe='" + describe + '\'' +
                ", manufactured='" + manufactured + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
