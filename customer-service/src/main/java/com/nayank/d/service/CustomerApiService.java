package com.nayank.d.service;

import java.util.List;

import com.nayank.customer.model.Address;
import com.nayank.customer.model.Customer;

public interface CustomerApiService {


	Long addCustomer(Customer customer) throws Exception;


	void deleteCustomer(Long customerId) throws Exception;


	List<Customer> findCustomersByStatus(List<String> status);


	Customer getCustomerById( Long customerId);


	Customer updateCustomer( Customer body);



	Customer updateCustomerAddress(Long customerId,Address customerAddress);


}
