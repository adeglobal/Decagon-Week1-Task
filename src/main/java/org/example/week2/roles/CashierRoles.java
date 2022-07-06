package org.example.week2.roles;

import org.example.week2.model.Customer;

public interface CashierRoles {

    double sellProduct(Customer customer);


    void printReceipt(Customer customer);
}
