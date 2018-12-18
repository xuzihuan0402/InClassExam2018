package com.exam;

import java.util.ArrayList;
import java.util.List;

public class Order {
	List<Ticket> tickets =new ArrayList<Ticket>();
	public void add(Ticket ticket) {
		tickets.add(ticket);
	}

	public void print() {
		for(Ticket ticket : tickets) {
			System.out.println(ticket.origin+" "+ ticket.destination+" "+ticket.price+"  "+ ticket.quantity+"  "+ticket.price*ticket.quantity);
		}
		
	}
	

}
