package org.example.week2.model;

import java.util.ArrayList;

public class Customer extends Person {

    private double wallet;
    private ArrayList<Product> customerCart;

    public Customer(String name, String Sex, double wallet) {
        super(name, Sex);
        this.customerCart = new ArrayList<>();
        this.wallet = wallet;
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

    public void addToCart(Product product) {
        customerCart.add(product);
    }


    public void buyProduct(Store store, String productName, int quantity) {
        //check if the product is in the store ,if no print  unavailable.
        // if yes, check if the quantity we are buying is not bigger than what is in the store or if it's  zero
        // If yes ,add to cart , // else print  out of stock
        int productInStoreIndex = store.productFinder(productName);
        if (productInStoreIndex >= 0) {
            Product productInStore = store.getProductArrayList().get(productInStoreIndex);
            if (productInStore.getQuantity() <= quantity) {
                System.out.println("out of stock");
            } else {
                Product purchasedProduct = new Product();
                purchasedProduct.setProductName(productInStore.getProductName());
                purchasedProduct.setQuantity(quantity);
                purchasedProduct.setCategory(productInStore.getCategory());
                purchasedProduct.setPrice(productInStore.getPrice());
                this.customerCart.add(purchasedProduct);
                System.out.println(productInStore.getProductName() + " have been added to your cart");
                productInStore.setQuantity(productInStore.getQuantity() - quantity);
            }
        } else {
            System.out.println("Product Unavailable");
        }
    }
}
