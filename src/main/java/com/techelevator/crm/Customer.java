package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.ArrayList;
import java.util.Map;

public class Customer extends Person implements Billable {

    private String phoneNumber;
    private ArrayList<String> pets = new ArrayList();

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<String> getPets() {
        return pets;
    }

    public void setPets(ArrayList<String> pets) {
        this.pets = pets;
    }

    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
        this.phoneNumber = "";
    }

    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double total = 0.0;
        for(String key : servicesRendered.keySet()){
            total = total + servicesRendered.get(key);
        }
        return total;
    }
}
