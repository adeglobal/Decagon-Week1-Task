package org.example.week1.model;

public abstract class Person {
    private String name;

    private int  Id;

    private String Sex;

    public Person(String name ,String Sex)  {
        this.name = name;
        this.Sex=Sex;
    }
    public Person(String name, int Id ,String Sex)  {
        this.name = name;
        this.Id = Id;
        this.Sex=Sex;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }

    public String getSex() {
        return Sex;
    }
}
