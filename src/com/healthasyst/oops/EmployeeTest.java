package com.healthasyst.oops;

abstract class Employee {
	private int empId;
	private String empName;
	
//	public Employee()
//	{
//		System.out.println("Object Created");
//	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public abstract double calculateSalary();

	public abstract void displayEmployeeDetails();
}

class PermanentEmployee extends Employee {

	public void displayEmployeeDetails() {
		System.out.println(super.getEmpId());
		System.out.println(super.getEmpName());
	}

	public double calculateSalary() {
		System.out.println(30 * 2000);
		return 30 * 2000;
	}

}

class ContractEmployee extends Employee {

	public double calculateSalary() {
		System.out.println(8 * 20 * 5);
		return 8 * 20 * 5;
	}

	public void displayEmployeeDetails() {
		System.out.println(super.getEmpId());
		System.out.println(super.getEmpName());
	}

}

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee p = new PermanentEmployee();

		p.setEmpName("john");

		System.out.println(p.calculateSalary());
		
		Employee c = new ContractEmployee();

	}

}
