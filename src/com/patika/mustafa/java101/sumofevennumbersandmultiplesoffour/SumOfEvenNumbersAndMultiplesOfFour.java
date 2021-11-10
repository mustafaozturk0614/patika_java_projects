package com.patika.mustafa.java101.sumofevennumbersandmultiplesoffour;

import java.util.Scanner;

public class SumOfEvenNumbersAndMultiplesOfFour {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.println("lütfen bir sayı giriniz");
			int number = scanner.nextInt();
			if (number % 2 == 1) {
				break;
			} else {
				if (number % 2 == 0 || number % 4 == 0) {
					sum += number;
					
				}
			}
			
		}
		System.out.println(sum);
	}
	
}
