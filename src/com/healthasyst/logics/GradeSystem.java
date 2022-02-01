package com.healthasyst.logics;

public class GradeSystem {

	public static void main(String[] args) {
		
		int mark=95;
		
		//ingore value above 100 and negative value
		//allocate the grade
		if(mark>=100 || mark<0)
		{
			System.out.println("Invalid input");
		}
		else if(mark>=90)
		{
			System.out.println("A");
		}
		else if(mark>=80 && mark<=89)
		{
			System.out.println("B");
		}
		else if(mark>=60 && mark<=79)
		{
			System.out.println("c");
		}
		else if(mark<=60)
		{
			System.out.println("F");
		}
		
	}

}
