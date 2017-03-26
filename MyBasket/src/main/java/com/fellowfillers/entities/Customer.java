package com.fellowfillers.entities;

/**
 * Created by ssaha on 3/23/17.
 */
public class Customer {
	private long customerId;
	private String customerName;
	private String homeAddress;
	private String homePhone;
	private String mobilePhone;
	
	public long getCustomerId () {
		return customerId;
	}
	
	public void setCustomerId (long customerId) {
		this.customerId = customerId;
	}
	
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
	
	@Override
	public String toString () {
		return String.format (
				"Customer[customerId=%d,customerName=%s,homeAddress=%s,homePhone=%s,mobilePhone=%s]",
				customerId, customerName, homeAddress, homePhone, mobilePhone
		);
	}
}
