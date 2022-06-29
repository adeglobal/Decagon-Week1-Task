package org.example.week1.model;

import java.util.ArrayList;

public class Customer extends Person {

    private double wallet;
   private ArrayList<Product> customerCart;
    public Customer(String name, String Sex, double wallet) {
        super(name, Sex);
        this.customerCart = new ArrayList<>();
        this.wallet =  wallet;
    }

    public ArrayList<Product> getCustomerCart() {
        return customerCart;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public  void addToCart(Product product){
        customerCart.add(product);
    }
}
