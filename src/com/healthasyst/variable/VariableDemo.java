package com.healthasyst.variable;

public class VariableDemo {
	public static int aS=10; //static variable or class variable 
	public static int bS=20;
	
	public int aNS=10; //non-static variable or instance variable 
	public int bNS=20;

	
	public static void main(String[] args) {
		
		VariableDemo.aS=100;
		
		System.out.println(VariableDemo.aS);
		System.out.println(VariableDemo.bS);
	
		VariableDemo obj1=new VariableDemo();
		System.out.println(obj1);
		
		VariableDemo obj2=new VariableDemo();
		System.out.println(obj2);
		
		VariableDemo obj3=new VariableDemo();
		
//		obj2=null;
//		obj2=obj1;
		
		obj1.bNS=5000;
		System.out.println(obj1.aNS);
		System.out.println(obj1.bNS);
		
		System.out.println(obj2.aNS);
		System.out.println(obj2.bNS);
		
		System.out.println(obj3.aNS);
		System.out.println(obj3.bNS);
		
		
	}

}
