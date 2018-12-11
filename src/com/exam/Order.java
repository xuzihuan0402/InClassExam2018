package com.exam;

public class Order {
	String origin;
	String destination;
	int price;
	int quantity;
	Ticket order =new Ticket();
	
	public int add(){
		return (price*2);
	}
	
	public void print(){
		System.out.println(origin+","+destination+","+value+quantity);
	}
	

}
