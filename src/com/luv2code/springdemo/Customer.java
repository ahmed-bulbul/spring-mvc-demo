package com.luv2code.springdemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	

	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=2, max=30)
	private String lastName;

	public String getFirstName() {
		return firstName; 
	}
	@Min(value = 0,message="must be grater than zeo")
	@Max(value = 10,message="must be less than ten")
	public int freePasses; 

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	

	

	
}


