package com.techelevator.crm;

import com.techelevator.hr.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTests {

    Employee employee = new Employee("Tina", "Belcher");
    Map<String, Double> billable = new HashMap<String, Double>();

    @Test
    public void getBillable() {
        billable.put("Walking", 100.00);
        billable.put("Grooming", 75.00);
        billable.put("Sitting", 300.00);

        // customer.getBalanceDue(billable);

        //return billable;

        //The third number is "delta" which = how big of a margin of error is allowed for answers!
        Assert.assertEquals(425.00, employee.getBalanceDue(billable),0.0);
        //"Error!!", 475.00, customer.getBalanceDue(billable));
    }

}
