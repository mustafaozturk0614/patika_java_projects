package com.patika.mustafa.java101.fibonacci;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("kaç adet fibonacci sayısı yazdımak istiyorsunuz");
		int count = scanner.nextInt();
		int number1 = 0;
		int number2 = 1;
		int temp = 0;
		System.out.print("0 1");
		for (int i = 2; i < count; i++) {
			
			temp = number1 + number2;
			System.out.print(" " + temp);
			number1 = number2;
			number2 = temp;
			
		}
		
	}
}
