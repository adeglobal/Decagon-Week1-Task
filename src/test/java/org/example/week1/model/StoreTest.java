package org.example.week1.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    void storeIsHiring_shouldReturnTrueForAge14Years() {
        Applicant applicant = new Applicant("", "", 14);

        Manager manager = new Manager("", 001, "male");

        Store store = new Store(manager);

        boolean actual = store.storeIsHiring(applicant);

        assertTrue(actual);
    }


    @Test
    void storeIsHiring_shouldReturnTrueForAge39Years() {
        Applicant applicant = new Applicant("", "", 39);

        Manager manager = new Manager("", 001, "male");

        Store store = new Store(manager);

        boolean actual = store.storeIsHiring(applicant);

        assertTrue(actual);
    }

    @Test
    void storeIsHiring_shouldReturnTrueForAge42Years() {
        Applicant applicant = new Applicant("", "", 42);

        Manager manager = new Manager("", 001, "male");

        Store store = new Store(manager);

        boolean actual = store.storeIsHiring(applicant);

        assertTrue(actual);
    }
    @Test
    void assignOfficeToCashier() {
        Manager manager = new Manager("", 001, "male");
        Store store = new Store(manager);
        assertNull(store.getCashier());
        Cashier cashier = new Cashier("", 001, "male");
        store.assignOfficeToCashier(cashier);
        assertNotNull(store.getCashier());

    }
}