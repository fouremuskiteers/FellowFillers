package com.mybasket.entities;

/**
 * Created by ssaha on 3/23/17.
 */
public class Customer {
	private String customerName;
	private String homeAddress;
	private String homePhone;
	private String mobilePhone;
	
	public String getCustomerName () {
		return customerName;
	}
	
	public void setCustomerName (String customerName) {
		this.customerName = customerName;
	}
	
	public String getHomeAddress () {
		return homeAddress;
	}
	
	public void setHomeAddress (String homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	public String getHomePhone () {
		return homePhone;
	}
	
	public void setHomePhone (String homePhone) {
		this.homePhone = homePhone;
	}
	
	public String getMobilePhone () {
		return mobilePhone;
	}
	
	public void setMobilePhone (String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
}
