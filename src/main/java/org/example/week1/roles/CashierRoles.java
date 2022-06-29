package org.example.week1.roles;

import org.example.week1.model.Customer;

public interface CashierRoles {

    double sellProduct(Customer customer);


    void printReceipt(Customer customer);
}
