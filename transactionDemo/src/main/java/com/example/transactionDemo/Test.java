package com.example.transactionDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//reflection
		
		Class<?> studentInfo = Class.forName("com.example.transactionDemo.Student");
		Student student =(Student) studentInfo.newInstance();
	Class[] methodArgsType=	new Class[] {Integer.class};
//	Method method=studentInfo.getDeclaredMethod("attendLesson", methodArgsType);
//	method.invoke(student, 101);
	
	Method method1=studentInfo.getDeclaredMethod("attendLesson");
	method1.invoke(student, null);
	
//		Constructor<?>[] constructor = studentInfo.getConstructors();
//		for(Constructor constr:constructor) {
//			System.out.println(constr);
//		}
//		
//		Method[] declaredMethods = studentInfo.getDeclaredMethods();
//		for(Method method:declaredMethods) {
//			System.out.println(method);
//		}
	}

}
