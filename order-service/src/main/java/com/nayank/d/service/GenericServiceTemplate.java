package com.nayank.d.service;

public abstract class GenericServiceTemplate {
	
	
	
	abstract void validate  (Object request)throws Exception ;
	abstract Object handle(Object request)throws Exception ;
	
	Object process(Object request) throws Exception 
	{
		validate(request);
		return handle(request);
		
	}
	
	
	

}
