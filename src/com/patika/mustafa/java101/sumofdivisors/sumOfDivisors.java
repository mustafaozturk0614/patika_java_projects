package com.patika.mustafa.java101.sumofdivisors;

import java.util.Scanner;

public class sumOfDivisors {
	
	public static void main(String[] args) {
		averageOfTotals();
		
	}
	
	private static void averageOfTotals() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen bir sayı giriniz");
		int n = scanner.nextInt();
		int count = 0;
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				count++;
				sum += i;
				
			}
			
		}
		if (count == 0) {
			System.out.println("3 e ve 4 e bölünen bir sayı yoktur");
		} else {
			System.out.println("3 e ve 4 e bölünen sayıların toplamının ortalaması= " + (sum / count));
		}
		scanner.close();
	}
	
}
