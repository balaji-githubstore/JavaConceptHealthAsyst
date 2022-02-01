package com.healthasyst.loops;

public class LoopsDemo3 {
	public static void main(String[] args) {

		int[] numbers = { 101, 65, 87, 65, 25, 33, 49, 58, 79, 66, 78, 500 };

		for (int num : numbers) {
			System.out.println(num);
		}

		String[] colors = { "red", "green", "yellow", "blue", "pink" };

		for (String color : colors) {
			System.out.println(color);
		}

		for (int num : numbers) {
			if (num == 87) {
				System.out.println("Yes!!!Present");
				break;
			}
		}

	}

}
