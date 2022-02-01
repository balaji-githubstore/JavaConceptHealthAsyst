package com.healthasyst.datatypes;

public class ArrayDemo {

	public static void main(String[] args) {
		//added comment on 9:45
		//check
		int[] numbers= new int[5]; //5*32 bits of memory
		
		numbers[0]=40;
		numbers[1]=51;
		numbers[2]=64;
		numbers[3]=81;
		numbers[4]=78;
		
		System.out.println(numbers);
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		char[] letters=new char[2];
		letters[0]='$';
//		letters[1]='8';
		
		System.out.println(letters[0]);
		System.out.println(letters[1]);
		
		//red, green, yellow 
		String[] colors=new String[3];
		colors[0]="red";
		colors[1]="green";
		colors[2]="yellow";
		
		System.out.println(colors[0]);
		System.out.println(colors[1]);
		System.out.println(colors[2]);
		
		
	}

}
