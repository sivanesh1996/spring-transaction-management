package com.example.transactionDemo1;

public class ITEmployee implements IEmployee {

	private int id;
	private double salary;
	private String name;
	
	@Override
	public void giveHike(double amount) {
		// TODO Auto-generated method stub
		this.setSalary(this.getSalary()+amount);
		
	}

	@Override
	public void payCut(double amount) {
		// TODO Auto-generated method stub
		this.setSalary(this.getSalary()-amount);		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
