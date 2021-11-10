package com.patika.mustafa.java101.diamondwithstar;

import java.util.Scanner;

public class DiomandWithStar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("lütfen bir sayı giriniz");
		int number = scanner.nextInt();
		
		for (int i = 1; i <= number; i++) {// for (int i = 1; i <= n; i++)
			
			for (int j = 1; j <= number - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
	
}
