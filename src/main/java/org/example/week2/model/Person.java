package org.example.week2.model;

public abstract class Person {
    private String name;

    private int id;

    private String sex;

    // constructor for applicant
    public Person(String name ,String Sex)  {
        this.name = name;
        this.sex=Sex;
    }
    // constructor for manager and cashier
    public Person(String name, int id ,String Sex)  {
        this.name = name;
        this.id = id;
        this.sex=Sex;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSex() {
        return sex;
    }

}
