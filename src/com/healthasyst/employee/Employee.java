package com.healthasyst.employee;

public class Employee {
	public int empId;
	public String empName;
	public double empSalary;
	public static String companyName;
	
	//print employee details
//	public static void printEmployeeDetail(Employee emp)
//	{
//		System.out.println(emp.empId);
//		System.out.println(emp.empName);
//		System.out.println(emp.empSalary);
//		System.out.println(Employee.companyName);
//		System.out.println("----------------------------");
//	}
	
	public void printEmployeeDetail()
	{
//		System.out.println(this);
//		System.out.println(this.empId);
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(Employee.companyName);
		System.out.println("----------------------------");
	}

}
