package com.SpringBootRestAPIJDBCCurdOperation6jdbc3.entity;

public class Passanger {

	private int id;
	private String name;
	private String arrival;
	private String destination;
	
	public Passanger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passanger(int id, String name, String arrival, String destination) {
		super();
		this.id = id;
		this.name = name;
		this.arrival = arrival;
		this.destination = destination;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
}
