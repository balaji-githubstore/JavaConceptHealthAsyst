package com.healthasyst.collections;

import java.util.ArrayList;

import com.healthasyst.employee.Employee;

public class CollectionsDemo1 {
	
	public static void main(String[] args) {
		
		ArrayList lists=new ArrayList(); //non-generic
		
		lists.add(100); //boxing
		lists.add("Balaji");
		lists.add(78.2);
		lists.add(new Employee());
		
		int a=(int) lists.get(0); //unboxing
		String name=(String) lists.get(1);
		Employee e= (Employee) lists.get(3);
		
		System.out.println();
		
	}

}
