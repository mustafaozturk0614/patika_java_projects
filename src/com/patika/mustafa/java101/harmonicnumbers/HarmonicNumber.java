package com.patika.mustafa.java101.harmonicnumbers;

import java.util.Scanner;

public class HarmonicNumber {
	// Harmonik
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("lütfen bir sayı giriniz");
		double number = scanner.nextInt();
		double sum = 0;
		for (int i = 1; i <= number; i++) {
			
			sum += 1.0 / i;
			System.out.printf(" (1/%d) ", i);
			if (i < number)
				System.out.print("+");
		}
		
		System.out.println("\n sonuç: " + sum);
		
	}
	
}
