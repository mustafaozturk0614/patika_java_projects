package com.patika.mustafa.java101.hormonicavarage;

import java.util.Scanner;

public class HarmonicAvarage {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("lütfen bir sayı giriniz");
		int number = scanner.nextInt();
		int[] numbers = new int[number];
		double sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			
		}
		for (int i = 0; i < numbers.length; i++) {
			
			sum += 1.0 / numbers[i];
			System.out.printf(" (1/%d) ", numbers[i]);
			if (i < numbers.length - 1)
				System.out.print("+");
		}
		double avarage = numbers.length / sum;
		System.out.printf("\nHarmonik ortalama: %f ", avarage);
	}
}
