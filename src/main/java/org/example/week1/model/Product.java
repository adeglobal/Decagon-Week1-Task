package org.example.week1.model;

public class Product {
    private String productName;
    private double price;
    private double quantity;


    public Product(String productName, double price, double quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;

    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}

