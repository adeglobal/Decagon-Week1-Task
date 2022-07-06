import org.example.week2.model.*;

//import static org.example.week1.enums.ProductList.*;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Ade",123, "male");

        Customer customer1 = new Customer("segun","Male", 100000.0);
        Customer customer2= new Customer("Bose", "female", 180.0);
        Applicant applicant1 = new Applicant("Tunde", "male" ,25);

       Store store = new Store(manager);
       store.restock("sampledatafoodsales.csv");

       customer1.buyProduct(store, "garri", 50);
       customer1.buyProduct(store, "carrot", 900);

        for (Product product : store.getProductArrayList()) {
            System.out.println(product);
        };

//        Cashier cashier = manager.hire(applicant1);
//       System.out.println("Mr " + manager.getName() + " the mannager hired  a cashier who goes by the name "+ cashier.getName());


//       store.performTransaction(customer1, cashier);
//
//       System.out.println("A customer whose name is " + customer1.getName() + " bought "
//               + product1.getQuantity() + " " + product2.getProductName() +" at "+ product1.getPrice() +  " naira");








        String path = "sampledatafoodsales.csv";
        Store shoprite = new Store(manager);
        shoprite.restock(path);

         for (Product products : shoprite.getProductArrayList()){
          System.out.println(products);


      }

    }
}
