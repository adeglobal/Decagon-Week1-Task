package org.example.week1.model;

import org.example.week1.roles.IStoreActivities;

public class Store implements IStoreActivities {
    private final Manager manager;
    private Cashier cashier;


    private double accountBalance;


    public Store(Manager manager) {
        this.manager = manager;
    }


    public Cashier getCashier() {
        return cashier;
    }

    @Override
    public void performTransaction(Customer customer, Cashier cashier) {
        // money deducted from customer
        // money added to store account balance
        double balance = cashier.sellProduct(customer);
        System.out.println("Sales from transactions is N" + balance);
        this.accountBalance += balance;
    }

    @Override
    public boolean storeIsHiring(Applicant applicant) {
        //write code

        Cashier hireCashier = manager.hire(applicant);
        if (hireCashier == null) {
            return true;
        } else {
            assignOfficeToCashier(hireCashier);
            return false;
        }
    }

    public void assignOfficeToCashier(Cashier cashier) {
        this.cashier = cashier;
    }
}

