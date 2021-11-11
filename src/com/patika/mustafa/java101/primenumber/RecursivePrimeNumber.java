package com.patika.mustafa.java101.primenumber;

import java.util.Scanner;

public class RecursivePrimeNumber {
	
	public static int primeNumberRecursive(int number, int count) {
		
		if (number == 1) {
			return 1;
		}
		
		else if (count == 1) {
			return 0;
		} else if (number % count == 0) {
			
			return 1;
			
		} else {
			return primeNumberRecursive(number, count - 1);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir Sayı giriniz");
		int number = scanner.nextInt();
		int count = number - 1;
		int a = primeNumberRecursive(number, count);
		if (a == 0) {
			System.out.println("asal sayıdır");
			
		} else {
			System.out.println("asal sayı değildir");
		}
		
	}
}
