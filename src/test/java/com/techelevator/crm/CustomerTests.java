package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTests {

    Customer customer = new Customer("Anna", "Hallow");
    Map<String, Double> billable = new HashMap<String, Double>();

    @Test
    public void getBillable() {
        billable.put("Walking", 100.00);
        billable.put("Grooming", 75.00);
        billable.put("Sitting", 300.00);

       // customer.getBalanceDue(billable);

        //return billable;


        Assert.assertEquals(475.00, customer.getBalanceDue(billable),0.0);
                //"Error!!", 475.00, customer.getBalanceDue(billable));
    }

}
