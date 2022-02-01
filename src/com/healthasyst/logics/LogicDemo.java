package com.healthasyst.logics;

public class LogicDemo {

	public static void main(String[] args) {

		int num = 90;

		if (num > 0) {
			System.out.println("given number is positive = " + num);
		}

		else if (num == 0) {
			System.out.println("given number is zero");
		} else {
			System.out.println("given number is negative = " + num);
		}


		int page=205;
		
//		if(page>=100)
//		{
//			if(page<=200)
//			{
//				System.out.println("It's between 100 and 200 = "+page);
//			}
//		}
		
		if(page>=100 && page<=200)
		{
			System.out.println("It's between 100 and 200 = "+page);
		}
		
		String browser="CH";
		
		if(browser=="ch" || browser=="CH")
		{
			System.out.println("Launch browser - chrome");
		}
		else
		{
			System.out.println("Launch browser - firefox");
		}
	}
}
