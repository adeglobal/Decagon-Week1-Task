package org.example.week1.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void addToCart() {
        Customer customer = new Customer("", "", 100.0);

        Product product = new Product("", 70.0, 2.0);
        customer.addToCart(product);
        assertEquals(1, customer.getCustomerCart().size());

        Product newProduct = new Product("",39.0, 22);
        customer.addToCart(product);
        assertEquals(2,customer.getCustomerCart().size());
    }
}