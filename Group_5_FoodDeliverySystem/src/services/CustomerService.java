package services;

import java.util.ArrayList;
import java.util.List;

import entities.*;

public class CustomerService {
	
	private List<Customer> customerList = new ArrayList<>();
	
	public void addCustomer(Customer customer) {
		customerList.add(customer);
	}
	
	public Customer getCustomer(int userId) {
		for (Customer customer : customerList) {
	        if (customer.getUserId() == userId) { // Ensure `Customer` class has a `getId()` method
	            return customer;
	        }
	    }
	    System.out.println("Customer with ID " + userId + " not found.");
		return null;
	}
	
	public List<Customer> getCustomers() {
		return customerList;
	}

}
