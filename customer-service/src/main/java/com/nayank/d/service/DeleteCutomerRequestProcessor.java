package com.nayank.d.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nayank.f.persistance.CustomerRepository;

@Service
public class DeleteCutomerRequestProcessor extends GenericServiceTemplate{

	
	@Autowired 
	CustomerRepository customerRepository;
	
	
	@Override
	void validate(Object request) throws Exception {
		if(!customerRepository.findById((Long) request).isPresent())
		{
			throw new Exception("Customer not found");
		}
	}

	@Override
	Object handle(Object request) throws Exception {
		
		customerRepository.deleteById((Long) request);
		return null;
	}

}
