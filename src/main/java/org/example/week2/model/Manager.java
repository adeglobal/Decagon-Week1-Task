package org.example.week2.model;

import org.example.week2.roles.ManagerRoles;

public class Manager extends Person implements ManagerRoles {

    public Manager(String name, int id, String Sex) {
        super(name, id, Sex);
    }

    @Override
    public Cashier hire(Applicant applicant1) {  // Manager hires an applicant and returns cashNew
        if(applicant1.getAge() > 18 && applicant1.getAge() < 35){
            Cashier cashNew = new Cashier(applicant1.getName(),001,applicant1.getSex());
            return cashNew;
        }

        return null;
    }
}

