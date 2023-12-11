package com.example.transactionDemo1;

public interface IEmployee {

	void giveHike(double amount);
	void payCut(double amount);
	
	public double getSalary();

	public void setSalary(double salary);

	public String getName();

	public void setName(String name);
	
	public int getId();

	public void setId(int id);
	
}
