package com.healthasyst.collections;

import java.util.ArrayList;

import com.healthasyst.employee.Employee;

public class ObjectDemo1 {
	
	public static void main(String[] args) {
		
		int a=20;
		double b=20.5;
		
		String name="red";
		
		
		Object z=a; //boxing
		Object y=b; 
		Object u=name; 
		
		
		int res=(int) z; //unboxing
		
		String res1=(String) u; //unboxing
		
		System.out.println(res+res);
		
	}

}
