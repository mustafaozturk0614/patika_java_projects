package com.patika.mustafa.java101.palindrom;

import java.util.Scanner;

public class PalindromNumber {
	
	public String isPanlindrom() {
		System.out.println("Lütfen Bir sayı giriniz");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int tempNumber = number;
		int lastNumber, reverseNumber = 0;
		
		while (tempNumber != 0) {
			
			lastNumber = tempNumber % 10;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			tempNumber /= 10;
			
		}
		if (number == reverseNumber) {
			
			return "Girdiğiniz Sayı Bir Polindrom Sayıdır";
			
		} else {
			return "Girdiğiniz Sayı Bir Polindrom Sayı DEĞİLDİR";
		}
		
	}
	
	public static void main(String[] args) {
		
		PalindromNumber palindromNumber = new PalindromNumber();
		System.out.println(palindromNumber.isPanlindrom());
		
	}
	
}
