package com.patika.mustafa.java101.powersoffourandfive;

import java.util.Scanner;

public class PowersOfFourAndFive {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen üst sınır için bir sayı giriniz");
		int n = scanner.nextInt();
		int a = 0;
		System.out.println("------------------------------------");
		System.out.println("4 ün kuvvetleri");
		for (int i = 1; i < n; i = i * 4) {
			
			System.out.println("4 ün " + a + ". kuvveti= " + i);
			a++;
		}
		a = 0;
		System.out.println("------------------------------------");
		System.out.println("5 in kuvvetleri");
		for (int i = 1; i < n; i = i * 5) {
			
			System.out.println("5 in " + a + ". kuvveti= " + i);
			a++;
		}
		
	}
	
}
