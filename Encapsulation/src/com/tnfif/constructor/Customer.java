package com.tnfif.constructor;

public class Customer {
 private String customername;
 private int customerid;
 private String customeraddress;
	//default constructor  
 Customer(){
	 System.out.println("default");
  }
 //parameterized constructor
	public Customer(String customername, int customerid, String customeraddress) {
	
		this.customername = customername;
		this.customerid = customerid;
		this.customeraddress = customeraddress;//use source after generate source of fields
	}
 //getter and setter
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	@Override//by string to string
	public String toString() {
		return "Customer [customername=" + customername + ", customerid=" + customerid + ", customeraddress="
				+ customeraddress + "]";
	}
}
