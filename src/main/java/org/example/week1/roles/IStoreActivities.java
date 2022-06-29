package org.example.week1.roles;

import org.example.week1.model.Applicant;
import org.example.week1.model.Cashier;
import org.example.week1.model.Customer;
import org.example.week1.model.Manager;

public interface IStoreActivities {
    void performTransaction(Customer customer, Cashier cashier);
    boolean storeIsHiring(Applicant applicant);
}
