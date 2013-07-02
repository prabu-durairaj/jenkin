package com.mkyong.customer.bo;

import java.util.List;

import com.mkyong.customer.model.Customer;
 
public interface CustomerBo3{
 
  void addCustomer(Customer customer);
 
	List<Customer> findAllCustomer();
	String a;
 
}
