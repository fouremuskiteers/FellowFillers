package com.fellowfillers.entities;

/**
 * Created by ssaha on 3/23/17.
 */
public class Registration {
	private Customer customer;
	private Car car;
	
	public Customer getCustomer () {
		return customer;
	}
	
	public void setCustomer (Customer customer) {
		this.customer = customer;
	}
	
	public Car getCar () {
		return car;
	}
	
	public void setCar (Car car) {
		this.car = car;
	}
}
