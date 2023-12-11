package com.example.transactionDemo;

public class StudentProxy extends Student {

	public StudentProxy(Attendance attendance) {
		super(attendance);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void attendLesson() {
		// TODO Auto-generated method stub
		
		if(!super.getAttendance().isPresent()) {
			throw new RuntimeException("Student is not present");
		}
		super.attendLesson();
	}

}
