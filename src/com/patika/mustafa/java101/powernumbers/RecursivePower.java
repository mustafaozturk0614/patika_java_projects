package com.patika.mustafa.java101.powernumbers;

import java.util.Scanner;

public class RecursivePower {
	
	public static int powerR(int taban, int kuvvet) {
		
		int result = 1;
		if (kuvvet == 0) {
			return 1;
			
		} else {
			result *= taban;
			return result * powerR(taban, kuvvet - 1);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen taban değerini giriniz");
		int taban = scanner.nextInt();
		System.out.println("lütfen kuvvet değerini giriniz");
		int kuvvet = scanner.nextInt();
		
		System.out.println(powerR(taban, kuvvet));
	}
}
