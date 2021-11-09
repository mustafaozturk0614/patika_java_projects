package com.patika.mustafa.java101.flightamount;

import java.util.Scanner;

public class FlightAmount {
	
	public static void main(String[] args) {
		double amount = 0;
		final double UNITCHARGE = 0.10;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen Mesefayi km olarak giriniz");
		int distance = scanner.nextInt();
		System.out.println("lütfen yaşınızı giriniz");
		int age = scanner.nextInt();
		System.out.println("lütfen yolculuk tipini giriniz\n" + "1- Gidiş /n 2-Gidiş Dönüş");
		int travvelType = scanner.nextInt();
		amount = UNITCHARGE * distance;
		
		if (distance <= 0 || age <= 0 || travvelType <= 0 || travvelType > 2) {
			System.out.println("lütfen geçerli bir değer giriniz");
			
		} else {
			calculateAmount(amount, age, travvelType);
		}
		scanner.close();
	}
	
	private static void calculateAmount(double amount, int age, int travvelType) {
		switch (travvelType) {
			case 1:
				if (age < 12) {
					amount = amount - (amount * 0.5);
				} else if (age < 24) {
					amount = amount - (amount / 10);
				} else if (age > 65) {
					amount = amount - (amount * 3 / 10);
				}
				
				break;
			case 2:
				amount = amount * 2;
				if (age < 12) {
					amount = amount - (amount * 2 / 10);
					amount = amount - (amount * 0.5);
					
				} else if (age < 24) {
					amount = amount - (amount * 2 / 10);
					amount = amount - (amount / 10);
				} else if (age > 65) {
					amount = amount - (amount * 2 / 10);
					amount = amount - (amount * 3 / 10);
				}
				
				break;
			
			default:
				break;
		}
		System.out.println("Toplam Tutar: " + amount);
	}
}
