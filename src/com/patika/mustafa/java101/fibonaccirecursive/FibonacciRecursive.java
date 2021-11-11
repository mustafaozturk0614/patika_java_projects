package com.patika.mustafa.java101.fibonaccirecursive;

import java.util.Scanner;

public class FibonacciRecursive {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen bir sayı giriniz");
		int number = scanner.nextInt();
		System.out.println(fibonacci(number));
		
	}
	
	private static int fibonacci(int x) {
		
		if (x == 1 || x == 2) {
			return 1;
			
		}
		
		return fibonacci(x - 1) + fibonacci(x - 2);
		
	}
	
}
