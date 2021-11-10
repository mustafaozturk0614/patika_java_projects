package com.patika.mustafa.java101.maxandmin;

import java.util.Scanner;

public class MaxAndMin {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("kaç tane sayı gireceksiniz");
		int count = scanner.nextInt();
		int max = 0;
		int min = 0;
		
		for (int i = 1; i <= count; i++) {
			System.out.println(i + ".Sayıyı giriniz :");
			int number = scanner.nextInt();
			if (i == 1) {
				max = number;
				min = number;
			} else {
				if (number > max) {
					max = number;
					
				}
				if (number < min) {
					min = number;
				}
			}
			
		}
		System.out.printf("Girdiğiniz %d sayısıdan enküçüğü= %d \n", count, min);
		
		System.out.printf("Girdiğiniz %d sayısıdan enbüyüğü= %d \n", count, max);
		scanner.close();
	}
	
}
