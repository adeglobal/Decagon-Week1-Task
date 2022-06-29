package org.example.week1.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashierTest {
    private Cashier cashier = new Cashier("Cashier",1,"Male");
    private  Product product = new Product("Snacks",29.0,2);


     @Test
    void sellProduct(){
         Customer customer = new Customer("Name", "Male", 250.0);
         customer.addToCart(product);
         double actualPrice = cashier.sellProduct(customer);
         double expected = product.getPrice() * product.getQuantity();
         assertEquals(expected, actualPrice);
     }

}