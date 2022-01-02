package com.patika.mustafa.java101.guessthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int number = randomNumber();
		int right = 5;
		int input;
		int[] wrongAnswers = new int[5];
		
		System.out.println(number);
		while (right > 0) {
			System.out.println("lütfen 1 ile 100 arasında bir sayı giriniz");
			input = scanner.nextInt();
			scanner.nextLine();
			
			if (input < 1 || input >= 100) {
				System.out.println("Hatalı Değer Girdiniz");
				
				System.out.println("lütfen 1 ile 100 arasında bir sayı giriniz");
				
			} else
			
			if (checkNumber(input, number)) {
				System.out.print("Tahminleriniz ");
				for (int i : wrongAnswers) {
					if (i != 0)
						System.out.print(i + " ");
					
				}
				if (Again()) {
					right = 5;
					number = randomNumber();
				} else {
					break;
				}
				
			} else {
				
				wrongAnswers[right - 1] = input;
				right--;
				if (right == 0) {
					System.out.println("hakkınız kalmadı");
				} else {
					System.out.println(right + " Hakkınız Kaldı");
					System.out.println("------------------");
				}
				
			}
			if (right == 0) {
				
				System.out.println("Oyun Sona Ermiştir!!!");
				System.out.println("Gizli sayımız " + number);
				System.out.print("Tahminleriniz ");
				for (int i : wrongAnswers) {
					System.out.print(i + " ");
				}
			}
		}
		
	}
	
	private static int randomNumber() {
		Random random = new Random();
		int number = random.nextInt(100);
		return number;
	}
	
	public static boolean checkNumber(int number, int random) {
		
		if (number == random) {
			System.out.println("Tebrikler " + number + " sayısı doğru yanıt");
			
			return true;
		} else {
			if (random > number) {
				if (random - number <= 10) {
					System.out.println("Çok Yaklaştınız lütfen sayıyı arttınız");
					
				} else {
					System.out.println(number + " sayısı, gizli sayıdan küçüktür.");
				}
				
			} else if (number > random) {
				
				if (number - random <= 10) {
					System.out.println("çok yaklasştınız lütfen sayıyı azaltınız");
				} else {
					System.out.println(number + " sayısı, gizli sayıdan büyüktür.");
				}
				
			}
			return false;
		}
		
	}
	
	public static boolean Again() {
		
		System.out.println("Tekrar oynamak istermiseniz 'E' Tuşuna basınız");
		String choose = scanner.nextLine();
		if (choose.equalsIgnoreCase("e")) {
			return true;
			
		} else {
			System.out.println("Oyundan çıkılıyor");
			System.out.println("Güle Güle");
			return false;
		}
		
	}
}
