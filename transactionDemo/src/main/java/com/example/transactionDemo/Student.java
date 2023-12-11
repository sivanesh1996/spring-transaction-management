package com.example.transactionDemo;

public class Student implements DailySession {

	private Attendance attendance;
	
	public Student(Attendance attendance) {
		this.attendance = attendance;
	}
	
	public Student() {}

	public Attendance getAttendance() {
		return attendance;
	}



	public void setAttendance(Attendance attendance) {
		this.attendance = attendance;
	}



	@Override
	public void attendLesson() {
		System.out.println("attending lesson...");

	}
	
	public void attendLesson(Integer id) {
		System.out.println("student with id: "+id +" attending lesson");

	}

}
