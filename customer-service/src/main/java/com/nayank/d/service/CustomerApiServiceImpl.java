package com.nayank.d.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nayank.customer.model.Address;
import com.nayank.customer.model.Customer;

@Service
public class CustomerApiServiceImpl implements CustomerApiService{
	
	@Autowired 
	AddCutomerRequestProcessor addCutomerRequestProcessor;
	
	@Autowired 
	DeleteCutomerRequestProcessor deleteCutomerRequestProcessor;
	


	@Override
	public Long addCustomer(Customer customer) throws Exception {
		return (Long )addCutomerRequestProcessor.process(customer);
	}

	@Override
	public void deleteCustomer(Long customerId) throws Exception {
		deleteCutomerRequestProcessor.process(customerId);
	}

	@Override
	public List<Customer> findCustomersByStatus(List<String> status) {
		
		return null;
	}

	@Override
	public Customer getCustomerById(Long customerId) {
		
	return null;
	}

	@Override
	public Customer updateCustomer(Customer body) {
		
		return null;
	}

	@Override
	public Customer updateCustomerAddress(Long customerId, Address customerAddress) {
		
		return null;
	}

}
