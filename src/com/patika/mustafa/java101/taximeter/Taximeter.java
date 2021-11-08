package com.patika.mustafa.java101.taximeter;

import java.util.Scanner;

public class Taximeter {
	
	private final int MİNSALARY = 20;
	private final int OPENSLARY = 10;
	private final double UNITCHARGE = 2.2;
	private double distance;
	private double amount;
	
	public static void main(String[] args) {
		Taximeter taximeter = new Taximeter();
		taximeter.amountCalculate();
		
	}
	
	public void amountCalculate() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Mesafeyi km cinsinden giriniz");
		distance = scanner.nextDouble();
		amount = OPENSLARY + (distance * UNITCHARGE);
		
		if (amount < 20) {
			System.out.println("Ödenecek Tutar: " + MİNSALARY + " TL");
			
		} else {
			
			System.out.println("Ödenecek Tutar: " + amount + " TL");
		}
		scanner.close();
	}
}
