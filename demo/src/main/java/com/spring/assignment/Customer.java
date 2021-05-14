package com.spring.assignment;

public class Customer {
	private int customerId;
	private String customerName;
	private Address customerAddress;
	
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + "]";
	}

	public Customer(int customerId, String customerName, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	
	/*
	 * public int getCustomerId() { return customerId; } public void
	 * setCustomerId(int customerId) { this.customerId = customerId; } public String
	 * getCustomerName() { return customerName; } public void setCustomerName(String
	 * customerName) { this.customerName = customerName; } public Address
	 * getCustomerAddress() { return customerAddress; } public void
	 * setCustomerAddress(Address customerAddress) { this.customerAddress =
	 * customerAddress; }
	 */
	
	public void details() {
		System.out.println("Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + "]");
		
	}

}
