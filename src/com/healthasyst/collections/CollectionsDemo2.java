package com.healthasyst.collections;

import java.util.ArrayList;
import java.util.List;

import com.healthasyst.employee.Employee;

public class CollectionsDemo2 {
	
	public static void main(String[] args) {
		
//		ArrayList<String> lists=new ArrayList<String>(); //generic
		
		List<String> lists=new ArrayList<String>(); //generic
		
		lists.add("red"); 
		lists.add("blue");
		lists.add("white");
		lists.add("pink");
		
//		lists.remove(1);
//		lists.remove("white");
		lists.add("green");
		
		System.out.println(lists.get(2));
		
		for(String value : lists)
		{
			System.out.println(value);
		}
	}

}
