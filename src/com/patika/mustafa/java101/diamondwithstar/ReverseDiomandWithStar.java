package com.patika.mustafa.java101.diamondwithstar;

import java.util.Scanner;

public class ReverseDiomandWithStar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("lütfen bir sayı giriniz");
		int number = scanner.nextInt();
		
		for (int i = 0; i < number; i++) {
			String a = "%" + (i + 1) + "" + "s";
			String data = " ";
			System.out.printf(a, data);
			
			for (int j = number * 2 - 3 - i; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
