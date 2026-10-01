package services;

import java.util.ArrayList;


import modules.Admin;
import modules.Customer;


public class UserServices {
	private ArrayList<Customer>customerList=new ArrayList<>();
	private Admin admin=new Admin(18,"Admin","admin@gmail.com","1234");
	
	//To Add a Customer
	public  void addCustomer(Customer customer) {
		customerList.add(customer);
		System.out.println("Customer Added Successfully");
	}
	
	//To Display List Of All The  Customers
	public void displayCustomers() {
		if(customerList.isEmpty()) {
			System.out.println("No Customers Available");
			return;
		}else{
			for(Customer customer:customerList) {
				System.out.println(customer);
			}
		}
	}
	
	//To Customer Login
	public Customer customerLogin(String email,String password) {
		for(Customer customer:customerList) {
			if(customer.getMailid().equalsIgnoreCase(email) && customer.getPassword().equals(password)) {
				return customer;
		    }
	   }
	   return null;
}
	   
	//Admin Login
    public Admin admin(String email,String password) {
    	if(admin.getMailid().equalsIgnoreCase(email)&& admin.getPassword().equals(password)) {
		   return admin;
    	
        }
        return null;
    }
    
    //To Search a customer
    public Customer searchByCustomerId(int id) {
    	for(Customer customer:customerList) {
			if(customer.getUserid()==id) {
				System.out.println("Customer Found");
				return customer;
				
			}
		}
    	return null;
    }
    
    //To Delete  a customer
    public void deleteCustomer(int id) {
    	Customer customer=searchByCustomerId(id);
    if(customer!=null) {
    	customerList.remove(customer);
    	System.out.println("Customer Deleted Successfully");
    }else {
    	System.out.println("Customer Not Found");
    }	
    }
}