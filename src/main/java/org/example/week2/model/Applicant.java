package org.example.week2.model;

public class Applicant extends Person{


     private int age;
     public Applicant(String name, String Sex, int age) {
          super(name, Sex);
          this.age= age;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }
}
