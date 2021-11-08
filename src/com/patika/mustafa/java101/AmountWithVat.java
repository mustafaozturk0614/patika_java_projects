package com.patika.mustafa.java101;

import java.util.Scanner;

public class AmountWithVat {
	
	public static void main(String[] args) {
		double amount, lastamount;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Harcama Tutarını Giriniz: ");
		amount = scanner.nextDouble();
		
		if (amount > 0 && amount < 1000) {
			lastamount = amount * 1.18;
			
			System.out.println("tutar: " + amount + "tl kdvli fiyat: " + lastamount);
		} else if (amount >= 1000) {
			lastamount = amount * 1.08;
			
			System.out.println("tutar: " + amount + "tl kdvli fiyat: " + lastamount);
			
		} else {
			System.out.println("lütfen geçerli bir tutar giriniz");
		}
		scanner.close();
	}
	
}
