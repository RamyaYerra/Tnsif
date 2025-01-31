package com.tnfif.constructor;
import java.util.Scanner;
public class Constructordemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the customer name");
	String name=sc.next();
	System.out.println("enter the customer id");
	int id=sc.nextInt();
	System.out.println("enter the customer address");
	String address=sc.next();
	Customer c=new Customer();
	c.setCustomername(name);
	c.setCustomerid(id);
	c.setCustomeraddress(address);
	System.out.println(c);
	

}

}
