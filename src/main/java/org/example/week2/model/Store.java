package org.example.week2.model;

import org.example.week2.roles.IStoreActivities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Store implements IStoreActivities {
    private final Manager manager;
    private Cashier cashier;
    private double accountBalance;

    private ArrayList<Product> productArrayList;

    /* Constructors, getter and setters */
    public ArrayList<Product> getProductArrayList() {
        return productArrayList;
    }

    public Store(Manager manager) {
        this.manager = manager;
        productArrayList = new ArrayList<>();

    }


    public Cashier getCashier() {
        return cashier;
    }

    public void restock(String path) {
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (productFinder(values[4]) < 0) {// if the product is not in the arraylistOfProduct of the store, create product
                    Product newProduct = new Product();
                    newProduct.setProductName(values[4]);
                    newProduct.setCategory(values[3]);
                    newProduct.setQuantity(Integer.parseInt(values[5]));
                    newProduct.setPrice(Double.parseDouble(values[6]));
                    this.productArrayList.add(newProduct);
                }
                else {
                    int productIndex = productFinder(values[4]);// get the product index
                    Product product = this.productArrayList.get(productIndex); // get the product
                    product.setQuantity(product.getQuantity() + Integer.parseInt(values[5])); // set
                }

            }
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
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
 // This method implements searching each product by index and returns the index else return -1
    public int productFinder(String productName) {
        for (Product product : this.productArrayList) {
            if (productName.equalsIgnoreCase(product.getProductName())) {
                return productArrayList.indexOf(product);
            }
        }
        return -1;
    }

    public void assignOfficeToCashier(Cashier cashier) {
        this.cashier = cashier;
    }
}

