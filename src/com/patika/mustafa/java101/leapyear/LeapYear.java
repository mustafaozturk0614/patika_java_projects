package com.patika.mustafa.java101.leapyear;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		findLeapYear();
	}
	
	private static void findLeapYear() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen hesaplamak istedğiniz yılınızı şu şekilde (1990) giriniz");
		int year = scanner.nextInt();
		
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				
				System.out.printf("%d artık bir yıldır", year);
			} else {
				System.out.printf("%d artık bir yıl değildir", year);
			}
			
		} else {
			
			if (year % 4 == 0) {
				System.out.printf("%d artık bir yıldır", year);
			} else {
				System.out.printf("%d artık bir yıl değildir", year);
			}
		}
		scanner.close();
	}
}
