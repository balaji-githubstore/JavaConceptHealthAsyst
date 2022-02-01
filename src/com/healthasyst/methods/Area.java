package com.healthasyst.methods;

public class Area {

	public static double areaOfCircle(int r) {
		double area = 3.14 * r * r;
		return area;
	}

	public double areaOfTriangle(double base, double height) {
		return (base * height) / 2;
	}
	
	public double areaOfRectangle(double length,double width)
	{
		return length*width;
	}
	
	public static double areaOfSquare(double side)
	{
		return 4*side;
	}
	
	public static String getAuthorName()
	{
		String name="Balaji Dinakaran";
		System.out.println(name);
		return name;
	}
	
	public void printTypeDescription()
	{
		System.out.println("This class contains all methods related to area.");
	}

}
