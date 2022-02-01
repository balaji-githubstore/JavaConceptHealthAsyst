package com.healthasyst.loops;

public class Demo5 {

	public static void main(String[] args) {
		
		int i=1;
		
		int j=++i;  // pre-increment //increment (i=i+1) and then store the value
		
		System.out.println(i);
		System.out.println(j);
		
		int a=1;
		
		int b=a++;  // post-increment //store the value and then increment (a=a+1)
		
		System.out.println(a);
		System.out.println(b);
	}

}
