package com.healthasyst.methodoverloading;

public class CalcTest {

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		cal.add(10, 10.2);
		
		double res=Math.max(10, 13);
		System.out.println(res);
	}
}
