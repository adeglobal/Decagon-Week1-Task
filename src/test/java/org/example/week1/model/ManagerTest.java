package org.example.week1.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {


    @Test
    void testHireApplicant() {
        Manager manager = new Manager("Mary", 001, "female");
        Applicant applicant = new Applicant("Elvis", "male", 27);
        Cashier actual = manager.hire(applicant);
        Cashier expected = new Cashier("Elvis", 001, "male");
        assertEquals(expected, actual);
    }
}