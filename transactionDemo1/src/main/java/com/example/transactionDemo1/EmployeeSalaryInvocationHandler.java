package com.example.transactionDemo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EmployeeSalaryInvocationHandler implements InvocationHandler {
	
	private IEmployee employeeTarget;
	
	

	public EmployeeSalaryInvocationHandler(IEmployee employeeTarget) {
		this.employeeTarget = employeeTarget;
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//pre processing
		if(method.getName().equals("giveHike")) {
	double salaryHike=(double)args[0];
	if(salaryHike<0) {
		throw new RuntimeException("hike amount cannot be negative");
	}}
		
		//actual call to service layer
		Object returnVAl = method.invoke(employeeTarget, args);
		
		//post processing
		System.out.println("executing method: "+method.getName() +" for employee id: "+employeeTarget.getId());
		
		return returnVAl;
	}

}
