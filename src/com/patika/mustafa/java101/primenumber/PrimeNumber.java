package com.patika.mustafa.java101.primenumber;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lüfen bir sayı giriniz");
		int number = scanner.nextInt();
		boolean isPrimeNumber = true;
		
		if (number < 1) {
			
			System.out.println("lütfen 1 den büyük sayı giriniz");
		} else {
			System.out.printf("\t ===1 ile %d arasındaki Asal sayılar===\n\n", number);
			System.out.print(2 + " ");
			for (int i = 3; i < number; i++) {
				
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						isPrimeNumber = false;
						break;
					}
					
				}
				if (isPrimeNumber) {
					System.out.print(i + " ");
				}
				isPrimeNumber = true;
			}
			
		}
		
	}
	
}
