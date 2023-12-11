package com.example.transactionDemo1;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITEmployee itEmployee=new ITEmployee();
		itEmployee.setId(101);
		itEmployee.setSalary(30000);
		//itEmployee.giveHike(-5000);
		itEmployee.setName("Abhilash");
		
		EmployeeSalaryInvocationHandler handler=new EmployeeSalaryInvocationHandler(itEmployee);
		
		IEmployee employee =(IEmployee) Proxy.newProxyInstance(ITEmployee.class.getClassLoader(), 
				new Class[] {IEmployee.class},
				handler);
		
		employee.giveHike(5000);
		System.out.println(employee.getSalary());
		employee.payCut(200);
		System.out.println(employee.getSalary());

	}

}
