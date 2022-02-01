package com.healthasyst.datatypes;

public class DatatypesDemo {

	public static void main(String[] args) {

		byte a = 127; // occupy 8 bits of memory
		short b = 1; // 16 bit
		int c = 127; // 32 bit

		// Calculating the percentage of 1000 students
		// int -- 1000*32 bits = 32000 bits of memory
		// byte -- 1000*8 = 8000 bits of memory

		System.out.println(a);

		long d = 787877787878L; // 64 bit

		float e = 10.2f; // 32 bit
		double f = 10.2; // 64 bit

		char letter = '#'; // 16 bits

		boolean check = true;

		c = b; // implicit conversion
		f = e;

		float g = 1.12f;
		double h = 1.123456789;
		System.out.println(g);
		System.out.println(h);

		g = (float) h; // explicit conversion // leads to data loss

		System.out.println(g);

		String myName = "Balaji"; // 6*16 bits
		

		
		System.out.println(myName.charAt(5));

		System.out.println(myName.length());

		int radius = 10;
		// area of circle - 3.14 * radius * radius

		double result = 3.14 * radius * radius;

		System.out.println("Result is " + result);
		
		double r=22.0/7;
//		double r=(double)22/7;
		
		System.out.println(r);
		
		int base=25;
		int height=1;
		
		double res= (base*height)/2.0;
		System.out.println(res);
		
		System.out.println((float)25/2);
		
//		double a=25;
		System.out.println((double)25);
		
		double z= (double) 25;
	}

}
