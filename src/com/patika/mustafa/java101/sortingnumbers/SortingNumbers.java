package com.patika.mustafa.java101.sortingnumbers;

import java.util.Scanner;

public class SortingNumbers {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number1, number2, number3;
		System.out.println("lütfen 1. sayı giriniz");
		number1 = scanner.nextInt();
		
		System.out.println("lütfen 2. sayı giriniz");
		number2 = scanner.nextInt();
		
		System.out.println("lütfen 3. sayı giriniz");
		number3 = scanner.nextInt();
		
		if (number1 > number2) {
			if (number2 < number3) {
				if (number3 < number1) {
					System.out.println(number2 + "<" + number3 + "<" + number1);
				} else {
					System.out.println(number2 + "<" + number1 + "<" + number3);
				}
			} else {
				System.out.println(number3 + "<" + number2 + "<" + number1);
			}
			
		} else if (number2 > number1) {
			if (number1 < number3) {
				if (number3 < number2) {
					System.out.println(number1 + "<" + number3 + "<" + number2);
				} else {
					System.out.println(number1 + "<" + number2 + "<" + number3);
				}
			} else {
				System.out.println(number3 + "<" + number1 + "<" + number2);
			}
			
		}
		
		if (number1 < number2 && number1 < number3) {
			if (number2 < number3) {
				System.out.println("küçükten büyüğe doğru sıralama : " + number1 + "<" + number2 + "<" + number3);
			} else {
				System.out.println("küçükten büyüğe doğru sıralama :" + number1 + "<" + number3 + "<" + number2);
			}
			
		} else if (number2 < number1 && number2 < number3) {
			if (number1 < number3) {
				System.out.println("küçükten büyüğe doğru sıralama : " + number2 + "<" + number1 + "<" + number3);
			} else {
				System.out.println("küçükten büyüğe doğru sıralama : " + number2 + "<" + number3 + "<" + number1);
			}
			
		} else {
			if (number1 < number2) {
				System.out.println("küçükten büyüğe doğru sıralama : " + number3 + "<" + number1 + "<" + number2);
			} else {
				System.out.println("küçükten büyüğe doğru sıralama : " + number3 + "<" + number2 + "<" + number1);
			}
			
		}
		scanner.close();
	}
}