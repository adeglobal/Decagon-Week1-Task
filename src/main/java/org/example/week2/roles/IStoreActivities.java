package org.example.week2.roles;

import org.example.week2.model.Applicant;
import org.example.week2.model.Cashier;
import org.example.week2.model.Customer;

public interface IStoreActivities {
    void performTransaction(Customer customer, Cashier cashier);
    boolean storeIsHiring(Applicant applicant);
}
