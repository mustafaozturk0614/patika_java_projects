package com.patika.mustafa.java101.greengrocer;

import java.util.Scanner;

public class GreenGrocer {
	private final double PEARUNITCHARGE = 2.14;
	private final double APPLEUNITCHARGE = 3.67;
	private final double TOMATOESUNITCHARGE = 1.11;
	private final double BANANAUNITCHARGE = 0.95;
	private final double AUBERGINEUNITCHARGE = 5.00;
	private double amount = 0;
	
	public static void main(String[] args) {
		GreenGrocer greenGrocer = new GreenGrocer();
		greenGrocer.shoppingAmount();
	}
	
	public void shoppingAmount() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("kaç kilo armut ");
		amount = amount + PEARUNITCHARGE * (scanner.nextDouble());
		System.out.println("kaç kilo elma ");
		amount = amount + APPLEUNITCHARGE * (scanner.nextDouble());
		System.out.println("kaç kilo domates ");
		amount = amount + TOMATOESUNITCHARGE * (scanner.nextDouble());
		System.out.println("kaç kilo muz ");
		amount = amount + BANANAUNITCHARGE * (scanner.nextDouble());
		System.out.println("kaç kilo patlıcan ");
		amount = amount + AUBERGINEUNITCHARGE * (scanner.nextDouble());
		System.out.println("Toplam Tutar: " + amount + " TL");
		scanner.close();
	}
	
}
