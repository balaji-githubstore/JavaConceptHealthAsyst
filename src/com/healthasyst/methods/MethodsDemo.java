package com.healthasyst.methods;

public class MethodsDemo {

	public static void main(String[] args) {
		
		Area.areaOfCircle(50);

		int radius = 10;

		double result = Area.areaOfCircle(radius);
		System.out.println(result);

		result = Area.areaOfCircle(20);
		System.out.println(result);

		double power = Math.pow(2, 3);
		System.out.println(power);

		double random = Math.random();
		System.out.println(random);

		String authorName = Area.getAuthorName();
		System.out.println(authorName);
		
	    Area obj1= new Area();  // allocate memory for all non-static fields
		
		result= obj1.areaOfRectangle(4, 4);
		System.out.println(result);
		

		double res = obj1.areaOfTriangle(25, 1);
		System.out.println(res);
		
		obj1.printTypeDescription();
	}
}
