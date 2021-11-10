package com.patika.mustafa.java101.numberofdigits;

import java.util.Scanner;

public class NumberOfDigits {
	
	public static void main(String[] args) {
		int number, tempNumber, digitValue, digitNumber = 0, sum = 0, sum2 = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen Basamak Sayısını hesaplamak istediğiniz sayıyı giriniz");
		number = scanner.nextInt();
		tempNumber = number;
		
		while (tempNumber != 0) {
			digitValue = tempNumber % 10;
			sum += digitValue;
			
			tempNumber /= 10;
			digitNumber++;
			
		}
		tempNumber = number;
		for (int i = 0; i < digitNumber; i++) {
			digitValue = tempNumber % 10;
			sum2 += Math.pow(digitValue, digitNumber);
			tempNumber /= 10;
		}
		if (sum2 == number) {
			System.out.println("\n" + number + " sayısı bir Amstrong sayısıdır.\n");
			
		} else {
			System.out.println(number + " sayısı bir Amstrong sayısı değildir!!!\n");
		}
		System.out.println(number + " sayısının basamak sayılarının toplamı= " + sum);
		scanner.close();
	}
	
}
