package com.healthasyst.oops;

public class Student {
	private int studentId;
	private String studentName;
	private String studentMailId;
	private double studentPercentage;
	private static String schoolName;
	
	private static int counter=1001;
	
	public Student()
	{
		studentId=counter;
		counter=counter+1;
	}

	
}
