package com.exam;

import java.util.ArrayList;

public class Order {
	String origin;
	String destination;
	int price;
	int quantity;
	ArrayList bag = new ArrayList();
	
	public Order() {
		Ticket n = new Ticket();
		bag.add(n);
		
		
	}
	
	
	
	public void print(){
		System.out.println();
	}
	

}
