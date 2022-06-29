package org.example.week1.model;

import org.example.week1.roles.CashierRoles;

public class Cashier extends Person implements CashierRoles {

    public Cashier(String name, int Id, String Sex) {
        super(name, Id, Sex);
    }


    @Override
    public double sellProduct(Customer customer) {
        double totalAmount = 0;
        //double amount = 0;
        for (Product item : customer.getCustomerCart()) {
            totalAmount = item.getPrice() * item.getQuantity();
//            totalAmount += amount;
        }
        if (customer.getWallet() < totalAmount) {
            System.out.println("Insufficient Funds");
            return 0;
        } else {
            customer.setWallet(customer.getWallet() - totalAmount);
            System.out.println("Transaction Completed");
            printReceipt(customer);
            return totalAmount;
        }

    }

    @Override
    public void printReceipt(Customer customer) {
        System.out.println("S/N  || Product Name || Quantity || Amount");
        int num = 1;
        double amount = 0;
        double totalAmount = 0;
        for (Product item : customer.getCustomerCart()) {
            amount = item.getPrice() * item.getQuantity();
            totalAmount += amount;
            System.out.println(num +"   "+  item.getProductName() + "  "
                    + item.getQuantity() + "  "  + item.getPrice()* item.getQuantity());
            num++;
        }
        System.out.println("Total -----> " + totalAmount + "\n" +
                "THANKS FOR YOUR PATRONAGE");

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Cashier))
            return false;
        Cashier other = (Cashier) obj;

        return this.getId() == other.getId()
                && this.getName().equals(other.getName())
                && this.getSex().equals(other.getSex());
    }
}
