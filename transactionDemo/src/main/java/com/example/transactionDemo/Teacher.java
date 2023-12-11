package com.example.transactionDemo;

import java.util.Date;

public class Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailySession dailySession=new StudentProxy(new Attendance(new Date(), false));
		dailySession.attendLesson();

	}

}
