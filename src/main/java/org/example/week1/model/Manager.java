package org.example.week1.model;

import org.example.week1.roles.ManagerRoles;

public class Manager extends Person implements ManagerRoles {

    public Manager(String name, int Id, String Sex) {
        super(name, Id, Sex);
    }

    @Override
    public Cashier hire(Applicant applicant1) {  // Manager hires an applicant and returns cashier
        if(applicant1.getAge() > 18 && applicant1.getAge() < 35){
            Cashier cashNew = new Cashier(applicant1.getName(),001,applicant1.getSex());
            return cashNew;
        }

        return null;
    }
}

