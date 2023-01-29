package designprinciples.solid.dip.exercise.customer;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String args[]) {
        Map<Integer, Customer> customers = new HashMap<Integer, Customer>();
        customers.put(1, new Customer("John"));
        customers.put(2, new Customer("Susan"));
        CustomerService customerService = new CustomerService(new CustomerDao(customers));
        System.out.println(customerService.findById(1));
    }
}
