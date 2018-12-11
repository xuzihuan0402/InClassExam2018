package com.exam;

import java.util.ArrayList;

public class Ticket {
	String origin;
	String destination;
	int price;
	int quantity;
	ArrayList bag = new ArrayList();
	
	public Ticket() {
		this.origin = origin;
		this.destination = destination;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Ticket(String origin, String destination ,int price,int quantity){
		System.out.println(origin+ "\t" +destination+ "\t" +price+ "\t" +quantity+ "\t" + (price*quantity));
		bag.add(getClass());
	}
	

}
