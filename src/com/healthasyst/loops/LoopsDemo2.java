package com.healthasyst.loops;

public class LoopsDemo2 {
	
	public static void main(String[] args) {
		
		
		int[] numbers= {10,65,87,65,25,33,49,58,79,66,78};
		
		int size=numbers.length;
//		System.out.println(size);
		
		//to print the values which are less than or equal to 50
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]==87)
			{
				System.out.println("It's present "+numbers[i]);
				break;
			}
		}
		
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]==87)
			{
				continue;
			}
			
			System.out.println("It's present "+numbers[i]);
		}
		System.out.println("--------------------------");
		for(int i=1;i<=5;i++)
		{
			if(i==3)
			{
				continue;
			}
			
			System.out.println(i);
		}
	}

}
