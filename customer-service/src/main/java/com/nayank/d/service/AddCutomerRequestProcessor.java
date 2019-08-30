package com.nayank.d.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nayank.customer.model.Customer;
import com.nayank.f.persistance.Address;
import com.nayank.f.persistance.CustomerRepository;

@Service
public class AddCutomerRequestProcessor extends GenericServiceTemplate {

	@Autowired 
	CustomerRepository customerRepository;
	
	@Override
	void validate(Object request) throws Exception {
		Customer customer = (Customer)request;
		if (customer.getAddress()==null )
			throw new Exception("Address cant be empty");
	}

	@Override
	Long handle(Object request) throws Exception {
		com.nayank.f.persistance.Customer customer=  mapResourcetoPersistance(request);
		return customerRepository.save(customer).getCustomerId();
	}

	private com.nayank.f.persistance.Customer mapResourcetoPersistance(Object request) throws Exception {
		com.nayank.f.persistance.Customer customer = new com.nayank.f.persistance.Customer();
		com.nayank.customer.model.Customer  inputCust= (com.nayank.customer.model.Customer) request;
		customer.setName(inputCust.getName());
		customer.setStatus(inputCust.getStatus().toString());
		com.nayank.f.persistance.Address address = new com.nayank.f.persistance.Address();
		
		address.setCity(inputCust.getAddress().getCity());
		address.setCountry(inputCust.getAddress().getCountry());
		address.setState(inputCust.getAddress().getState());
		address.setStreetName(inputCust.getAddress().getStreetName());
		address.setStreetNumber(inputCust.getAddress().getStreetNumber());
		address.setZip(inputCust.getAddress().getZip());
		
		customer.setAddress(address);
		
		return customer;
	}

}
