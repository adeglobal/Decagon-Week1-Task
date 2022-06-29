import org.example.week1.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.week1.enums.ProductList.*;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Ade",123, "male");
        Product product1 = new Product(FRUITS.name(), 120,100);
        Product product2 = new Product(BEVERAGES.name(), 100,90);
        Customer customer1 = new Customer("segun","Male", 100000.0);
//        Customer customer2= new Customer("Bose", "female", 180.0);
        Applicant applicant1 = new Applicant("Tunde", "male" ,25);

        Store store = new Store(manager);

        Cashier cashier = manager.hire(applicant1);


        customer1.addToCart(product1);
        customer1.addToCart(product2);
        store.performTransaction(customer1, cashier);

        System.out.println("Mr " + manager.getName() + " the mannager hired  a cashier who goes by the name "+ cashier.getName());
        System.out.println("A customer whose name is " + customer1.getName() + " bought "  + product1.getQuantity() + " " + product2.getProductName() +" at "+ product1.getPrice() +  " naira");

    }
}
