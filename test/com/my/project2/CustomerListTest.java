package com.my.project2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerListTest {
    private Customer[] customers = new Customer[1];
    private int total;

    @Test
    public void addCustomer() {
        Customer customer = new Customer();
        if (total >= customers.length) {
            return ;
        }
        customers[total] = customer;
        total++;
        System.out.println("11111111");

    }
}