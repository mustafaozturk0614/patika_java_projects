package com.patika.mustafa.java101.repeatingevennumbers;

public class RepeatingEvenNumbers {
	
	public static void main(String[] args) {
		int[] list = { 5, 6, 7, 2, 6, 8, 2, 4, 5, 4 };
		int[] dublicate = new int[list.length];
		int index = 0;
		int count = 0;
		for (int i = 0; i < list.length; i++) {
			
			for (int j = 0; j < list.length; j++) {
				
				if (i != j && (list[i] == list[j]) && list[i] % 2 == 0) {
					if (isfind(dublicate, list[i])) {
						dublicate[index] = list[i];
						index++;
						break;
					}
					
				}
				
			}
		}
		System.out.println("Tekrar eden çift sayılar");
		for (int i : dublicate) {
			if (i != 0) {
				System.out.printf(i + " ");
			}
			
		}
		
	}
	
	public static boolean isfind(int[] array, int value) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return false;
			}
		}
		
		return true;
	}
	
}
