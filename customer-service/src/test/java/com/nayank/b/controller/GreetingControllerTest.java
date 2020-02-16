package com.nayank.b.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class GreetingControllerTest {

	@InjectMocks 
	GreetingController greetingController;

	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
	}


	@Test
	public void testGreeting() {
		Assert.assertNotNull(greetingController.greeting("Nayan"));
		Assert.assertTrue(greetingController.greeting("Nayan").getContent().contains("Nayan"));
		Assert.assertTrue(greetingController.greeting("Nayan").getContent().contains("Hello"));
	}

}
