package com.nayank.b.controller;

import javax.servlet.http.HttpServletRequest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nayank.customer.model.Customer;
import com.nayank.d.service.CustomerApiService;


@RunWith(MockitoJUnitRunner.class)
public class CustomerApiControllerTest {
	
	@Mock
	CustomerApiService customerApiService;
	
	@Mock
	ObjectMapper objectMapper;

	@Mock
	HttpServletRequest request;
	
	@InjectMocks
	CustomerApiController customerApiController;
	
	@Before
    public void initMocks(){
        MockitoAnnotations.initMocks(this);
    }

	@Test
	public void testAddCustomer() throws Exception {
		
		Customer customer = new Customer ();
		Mockito.when(customerApiService.addCustomer(customer)).thenReturn(new Long (1));
		Assert.assertTrue(customerApiController.addCustomer(customer).getStatusCode().equals(HttpStatus.CREATED));
		Assert.assertTrue(customerApiController.addCustomer(customer).getBody().equals(new Long(1)));

		Mockito.when(customerApiService.addCustomer(null)).thenThrow(new Exception());
		Assert.assertTrue(customerApiController.addCustomer(null).getStatusCode().equals(HttpStatus.METHOD_NOT_ALLOWED));
		
	}

	@Test
	public void testDeleteCustomer() throws Exception {
		Long customerId = new Long (1);
		Mockito.doNothing().when(customerApiService).deleteCustomer(customerId);
		Assert.assertTrue(customerApiController.deleteCustomer(customerId).getStatusCode().equals(HttpStatus.OK));
		
		Long customerId2 = new Long (2);
		Mockito.doThrow(new Exception("Customer not found")).when(customerApiService).deleteCustomer(customerId2);
		Assert.assertTrue(customerApiController.deleteCustomer(customerId2).getStatusCode().equals(HttpStatus.NOT_FOUND));
		
		Long customerId3 = new Long (3);
		Mockito.doThrow(new Exception("None")).when(customerApiService).deleteCustomer(customerId3);
		Assert.assertTrue(customerApiController.deleteCustomer(customerId3).getStatusCode().equals(HttpStatus.UNAUTHORIZED));
		
	}

	@Test
	public void testFindCustomersByStatus() {
//		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomerById() {
//		fail("Not yet implemented");
	}

	@Test
	public void testUpdateCustomer() {
//		fail("Not yet implemented");
	}

	@Test
	public void testUpdateCustomerAddress() {
//		fail("Not yet implemented");
	}

}
